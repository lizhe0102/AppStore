package com.appStore.controller;

import com.appStore.model.AppMessage;
import com.appStore.service.IAppService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@Controller
@RequestMapping("/app")
public class AppController {
    @Resource
    private IAppService appService;

    @RequestMapping("/list/{start}/{length}")
    public void getAppList(HttpServletRequest request, HttpServletResponse response
    ,@PathVariable("start") String start,@PathVariable("length") String length)throws IOException
    {
        ///
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int s=Integer.parseInt(start);
        int l=Integer.parseInt(length);
        ArrayList<AppMessage> appMessages=this.appService.getAllAppMessage(s,l);
        ObjectMapper mapper=new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(appMessages));

    }

    @RequestMapping("/info/{id}")
    public void getAppInfo(HttpServletRequest request, HttpServletResponse response, @PathVariable("id") String id)throws IOException
    {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int Id = Integer.parseInt(id);
        AppMessage appMessage = this.appService.getAppMessage(Id);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(appMessage));
        response.getWriter().close();
    }

}

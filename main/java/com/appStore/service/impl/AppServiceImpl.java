package com.appStore.service.impl;


import com.appStore.model.App;
import com.appStore.model.AppMessage;
import com.appStore.dao.IAppDao;
import com.appStore.dao.ICategoryDao;
import com.appStore.dao.IImageDao;

import com.appStore.model.Category;
import com.appStore.model.Image;
import com.appStore.service.IAppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.ArrayList;

@Service("appService")
public class AppServiceImpl implements IAppService {
    @Resource
    private IAppDao appDao;
    @Resource
    private IImageDao imageDao;
    @Resource
    private ICategoryDao categoryDao;

    public  AppMessage getAppMessage(int id)
    {
        ArrayList<Category> categories= this.categoryDao.getCategory(id);
        ArrayList<Image> images=this.imageDao.getImage(id);
        App app =this.appDao.getApp(id);
        AppMessage appMessage=new AppMessage();
        appMessage.setApp(app);
        appMessage.setImages(images);
        appMessage.setCategories(categories);

        return appMessage;

    }


    public  ArrayList<AppMessage> getAllAppMessage()
    {
        return null;
    }

}

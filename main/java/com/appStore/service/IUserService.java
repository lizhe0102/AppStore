package com.appStore.service;

import com.appStore.model.User;

import java.util.ArrayList;
import java.util.List;

public interface IUserService {

     User selectUser(long id);

     ArrayList<User> selectAllUser();

}
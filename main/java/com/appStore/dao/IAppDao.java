package com.appStore.dao;

import com.appStore.model.App;

import java.util.ArrayList;

public interface IAppDao {
    App getApp(int id);
    ArrayList<App> getAllApp();
}

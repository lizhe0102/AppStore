package com.appStore.dao;

import com.appStore.model.Apps;

import java.util.ArrayList;

public interface IAppsDao {
    Apps getApp(int id);
    ArrayList<Apps> getAllApp();
}

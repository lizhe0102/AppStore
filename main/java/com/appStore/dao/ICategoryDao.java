package com.appStore.dao;

import com.appStore.model.Category;

import java.util.ArrayList;

public interface ICategoryDao {
    ArrayList<Category> getCategory(int id);
    ArrayList<Category> getAllCategory();
}

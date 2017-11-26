package com.appStore.dao;

import com.appStore.model.Category;
import org.apache.ibatis.annotations.Param;

import java.util.ArrayList;

public interface ICategoryDao {
    ArrayList<Category> getCategory(int id);
    ArrayList<Category> getAllCategory(@Param("start") int start, @Param("end") int end);
}

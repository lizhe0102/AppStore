package com.appStore.dao;

import com.appStore.model.Image;

import java.util.ArrayList;

public interface IImageDao {
    ArrayList<Image> getImage(int id);
    ArrayList<Image> getAllImage();
}

package com.appStore.beanResource;

import com.appStore.model.Apps;
import com.appStore.model.Category;
import com.appStore.model.Image;

import java.util.ArrayList;
import java.util.Date;

public class AppMessage {
    private Apps apps;
    private ArrayList<Image> images;
    private ArrayList<Category> categories;

    public Apps getApps() {
        return apps;
    }

    public void setApps(Apps apps) {
        this.apps = apps;
    }

    public ArrayList<Image> getImages() {
        return images;
    }

    public void setImages(ArrayList<Image> images) {
        this.images = images;
    }

    public ArrayList<Category> getCategories() {
        return categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }






}

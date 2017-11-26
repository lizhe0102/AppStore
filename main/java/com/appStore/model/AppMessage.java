package com.appStore.model;

import java.util.ArrayList;

public class AppMessage {
    private App app;
    private ArrayList<Image> images;
    private ArrayList<Category> categories;

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
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

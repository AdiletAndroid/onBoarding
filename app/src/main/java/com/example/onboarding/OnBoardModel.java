package com.example.onboarding;

public class OnBoardModel {
    private String title, descriptiion;
    private int image;

    public OnBoardModel(String title, String descriptiion, int image) {
        this.title = title;
        this.descriptiion = descriptiion;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public String getDescriptiion() {
        return descriptiion;
    }

    public int getImage() {
        return image;
    }
}

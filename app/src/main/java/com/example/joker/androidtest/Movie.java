package com.example.joker.androidtest;

public class Movie {

    String name, detail;
    int imageView;

    //TODO 6 Create setters and getters
public Movie(String name,String detail){

    this.name=name;
    this.detail=detail;
    this.imageView=imageView;

}



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }
}

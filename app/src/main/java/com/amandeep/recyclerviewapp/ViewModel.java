package com.amandeep.recyclerviewapp;

public class ViewModel {
    private int image;
    private String data;
    ViewModel(int image,String data)
    {
        this.image=image;
        this.data=data;
    }

    public int getImage() {
        return image;
    }

    public String getData() {
        return data;
    }

}

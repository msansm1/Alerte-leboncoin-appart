package com.example.jdagnogo.alertlebonsoinappart.models;

import com.example.jdagnogo.alertlebonsoinappart.models.realm.AppartRealm;

public class Appart {
    private String image;
    private String price;
    private String title;
    private String date;
    private boolean isPro;


    public Appart() {
    }

    public Appart(String image, String price, String title, String date, boolean isPro) {
        this.image = image;
        this.price = price;
        this.title = title;
        this.date = date;
        this.isPro = isPro;
    }

    public Appart(AppartRealm appartRealm) {
        this.image = appartRealm.getImage();
        this.price = appartRealm.getPrice();
        this.title = appartRealm.getTitle();
        this.date = appartRealm.getDate();
        this.isPro = appartRealm.isPro();
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public boolean isPro() {
        return isPro;
    }

    public void setPro(boolean pro) {
        isPro = pro;
    }
}

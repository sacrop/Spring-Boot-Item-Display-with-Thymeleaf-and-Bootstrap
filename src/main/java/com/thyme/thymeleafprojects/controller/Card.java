package com.thyme.thymeleafprojects.controller;

public class Card {
    private String title;
    private String description;
    private String cardurl;
    public Card(String title, String description, String cardurl) {
        this.title = title;
        this.description = description;
        this.cardurl = cardurl;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getCardurl() {
        return cardurl;
    }
    public void setCardurl(String cardurl) {
        this.cardurl = cardurl;
    }
    

}

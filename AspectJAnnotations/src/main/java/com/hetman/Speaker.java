package com.hetman;

public class Speaker {

    private String favouriteTopic;

    public Speaker(String favouriteTopic)
    {
        this.favouriteTopic = favouriteTopic;
    }

    public void speakAbout(String topic) {
        System.out.println("Hello everyone! I want to tell you about " + topic);
    }

    public String getFavouriteTopic()
    {
        return favouriteTopic;
    }
}

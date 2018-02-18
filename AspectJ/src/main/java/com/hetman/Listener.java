package com.hetman;

public class Listener {

    public void startListen()
    {
        System.out.println("I'd like to listen for an interesting speech...");
    }

    public void endListenFine(String topic)
    {
        System.out.println("It was an interesting speech about " + topic);
    }

    public void endListenError()
    {
        System.out.println("It is something wrong with your speech...");
    }

}

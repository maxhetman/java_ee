package com.hetman;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Listener {

    @Pointcut("execution(* com.hetman.Speaker.speakAbout(String)) && args(speechTopic)")
    public void speech(String speechTopic){}


    @Before("speech(String)")
    public void startListen()
    {
        System.out.println("I'd like to listen for an interesting speech...");
    }

    @AfterReturning("speech(topic)")
    public void endListenFine(String topic)
    {
        System.out.println("It was an interesting speech about " + topic);
    }

}

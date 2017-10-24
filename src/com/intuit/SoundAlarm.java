package com.intuit;

/**
 * Created by sshashidhar on 10/24/17.
 */
public class SoundAlarm implements Alarm{

    @Override
    public void activate() {
        System.out.println("SoundAlarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("SoundALarm deactivated");
    }
}

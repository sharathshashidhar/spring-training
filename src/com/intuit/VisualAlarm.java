package com.intuit;

/**
 * Created by sshashidhar on 10/24/17.
 */
public class VisualAlarm implements Alarm{

    @Override
    public void activate() {
        System.out.println("VisualAlarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("VisualAlarm deactivated");
    }
}

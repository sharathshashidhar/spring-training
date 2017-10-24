package com.intuit;

/**
 * Created by sshashidhar on 10/24/17.
 */
public class Door {

    private Alarm alarm;

    public void setAlarm(Alarm alarm) {
        this.alarm = alarm;
    }

    public void open(){
        alarm.activate();
    }
    public void close(){
        alarm.deactivate();
    }
}

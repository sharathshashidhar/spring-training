package com.intuit;

import java.util.List;

/**
 * Created by sshashidhar on 10/24/17.
 */
public class Company {
    private String name;
    private String location;
    private List<String> founders;
    private String hq;
    private long size;

    public Company(String name, String location){
        this.name = name;
        this.location = location;
        System.out.println("Company instantiated");
    }

    public void setFounders(List<String> founders) {
        this.founders = founders;
    }

    public String getHq() {
        return hq;
    }

    public void setHq(String hq) {
        this.hq = hq;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}

package com.illuwater.serviceprovider;

public class DemoService implements Service {

    private String name;

    public DemoService(String name){
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Service Demo " + name);
    }
}

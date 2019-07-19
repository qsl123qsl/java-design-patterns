package com.illuwater.serviceprovider;

public class DemoProvide implements Provider{
    @Override
    public Service newService() {
        return new DemoService("First");
    }
}

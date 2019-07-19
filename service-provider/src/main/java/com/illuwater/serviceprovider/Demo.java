package com.illuwater.serviceprovider;

public class Demo {

    public static void main(String[] args) {
        DemoProvide dp = new DemoProvide();

        ServiceProvider.registerProvider("first_dp",dp);
        ServiceProvider.registerProvider("second_dp",dp);

        Service s = ServiceProvider.newInstance("first_dp");

        s.print();
    }
}

package org.example;

import org.springframework.stereotype.Component;

@Component("MersedesBean")
public class Mersedes implements Car {
    @Override
    public String getModel() {
        return "Mercedes GL350 AMG";
    }

    @Override
    public double getPrice() {
        return 25000;
    }
}

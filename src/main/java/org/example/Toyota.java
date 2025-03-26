package org.example;

import org.springframework.stereotype.Component;

@Component("ToyotaBean")
public class Toyota implements Car {
    @Override
    public String getModel() {
        return "Toyota LandCruser 200";
    }

    @Override
    public double getPrice() {
        return 20000.0;
    }
}

package org.example;

import org.springframework.stereotype.Component;

@Component("BMWBean")
public class BMW implements Car {
    @Override
    public String getModel() {
        return "BMW X3 e83";
    }

    @Override
    public double getPrice() {
        return 15000;
    }

    @Override
    public int getYears() {
        return 2010;
    }

    @Override
    public double  getEngineVolume(){
        return 3.0;
    }

}

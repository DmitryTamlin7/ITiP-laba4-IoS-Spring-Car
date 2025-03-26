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

    @Override
    public int getYears() {
        return 2008;
    }

    @Override
    public double  getEngineVolume(){
        return 4.8;
    }

    @Override
    public String PlaceSell(){
        return "Avto.ru";
    }

}

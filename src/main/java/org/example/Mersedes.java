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

    @Override
    public int getYears() {
        return 2007;
    }

    @Override
    public double  getEngineVolume(){
        return 4.4;
    }
    @Override
    public String PlaceSell(){
        return "Avito";
    }

}

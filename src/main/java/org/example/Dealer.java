package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dealer {
    private final Car car;

    @Autowired
    public Dealer(@Qualifier("BMWBean") Car car) {
        this.car = car;
    }

    public void printModel(){
        System.out.println(" Car model: " + car.getModel() +
                           " CarYears: " + car.getYears() +
                           " EngineVolume " + car.getEngineVolume() +
                           " Car Price $: " + car.getPrice() +
                           " SellPlace: " + car.PlaceSell() );
    }
}



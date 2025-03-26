package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);


        Map<String, Car> cars = context.getBeansOfType(Car.class);

        for (Map.Entry<String, Car> entry : cars.entrySet()) {
            System.out.println("Use Bean " + entry.getKey());
            Dealer dealer = new Dealer(entry.getValue());
            dealer.printModel();

            System.out.println("//////////////////////////////////////////");

        }

        context.close();
    }
}

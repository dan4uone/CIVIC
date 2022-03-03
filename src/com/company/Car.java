package com.company;

public class Car {
    private String engine;
    private String transmission;

    public Car(String engine, String transmission) {
        this.engine = engine;
        this.transmission = transmission;
    }

    public String getEngine() {
        return engine;
    }

    public String getTransmission() {
        return transmission;
    }

}
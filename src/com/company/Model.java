package com.company;


public class Model extends Car {
    private String model;
    private Color color;

    public Model(String engine, String transmission, String model, Color color) {
        super(engine, transmission);
        this.model = model;
        this.color = color;
    }

    public String getModel() {
        return model;
    }


    public final void signal(String signal){
        System.out.println(signal);
    }

    public String getInfo() {
        return "\nEngine: " + getEngine() + "\nTransmission: "+ getTransmission() +  "\nModel: "  + model + "\nColor: " + color;
    }
}
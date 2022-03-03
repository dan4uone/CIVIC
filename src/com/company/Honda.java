package com.company;

public final class Honda extends Model {
    private double volume;
    private int year;

    public Honda(String engine, String transmission, String model, Color color, double volume, int year) {
        super(engine, transmission, model, color);
        this.volume = volume;
        this.year = year;
    }

    public double getVolume() {
        return volume;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nVolume: " + volume + "\nYears: " + year;
    }
}
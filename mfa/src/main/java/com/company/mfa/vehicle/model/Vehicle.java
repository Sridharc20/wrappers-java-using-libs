package com.company.mfa.vehicle.model;

public class Vehicle {
    private String model;
    private String fuel;

    public Vehicle(String model, String fuel) {
        this.model = model;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", fuel='" + fuel + '\'' +
                '}';
    }
}

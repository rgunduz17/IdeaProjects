package com.company;

public class Car {

    private int doors;
    public int tires;
    private String model;

    public void setModel(String model) {
        String validModel= model.toUpperCase();
        if (validModel.equals("camry") || validModel.equals("civic")) {
            this.model= model;

        } else {
            this.model = " belirsiz";
        }

        this.model= model;
    }
public String getModel() {
        return this.model;
}
}

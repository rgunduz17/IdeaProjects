package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Car toyota =new Car();
        Car honda = new Car();

        toyota.tires= 4;
        toyota.setModel("raw4");
        honda.setModel("civic");

        System.out.println("model is "+ toyota.getModel());
        System.out.println("model is "+ honda.getModel());

    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        Cars car = new Cars("Mersedes",100 );
        car.carsOptions();
        car.model= "BMW";
        car.speedMax = 150;
        car.carsOptions();
    }
}
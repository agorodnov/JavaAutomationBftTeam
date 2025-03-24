package org.example;

public class Main {
    public static void main(String[] args) {
//        Cars car = new Cars("Mersedes",2020 );
//        car.carsOptions();
//        car.model= "BMW";
//        car.years = 2023;
//        car.carsOptions();
        Cars car = new Cars ("Audi",2019);
        Cars car1 = new Cars ("Ferrari",2010);
        car.makeBeBe();
        car.model = "Ваз";
        car.years = 2000;
        car1.makeBeBe();
        car1.model = "Mercedes";
        car1.years = 2025;
        car.makeBeBe();
        car1.makeBeBe();
    }

}
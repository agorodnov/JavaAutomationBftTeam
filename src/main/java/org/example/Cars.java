package org.example;

public class Cars {
    public String model;
    public static String color = "Grey";
    public int speedMax;

    public Cars(String model, int speed) {
        this.model = model;
        this.speedMax = speed;
    }

    public void carsOptions () {
        System.out.println("Модель - " + model +  "\nЦвет - " + color +  "\nМаксимальная скорость - " +speedMax);
    }
}

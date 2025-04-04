package org.example;

public class Main {
    public static void main(String[] args) {
        //Задание № 1  выводит сообщение о работе сотрудников///
        Manager obj = new Manager("Иван: ",1222);
        Developer objb = new Developer("Игорь: ",4000);
        obj.work();
        objb.work();
        ///Задание № 2 по рисует фигуры//
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();
        circle.draw();
        rectangle.draw();
    }
}



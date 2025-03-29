package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {// Создаем объект Scanner для считывания данных
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        // Запрашиваем у пользователя сумму вклада
        System.out.print("Введите сумму вклада: ");
        float initialDeposit = scanner.nextFloat();

        // Запрашиваем у пользователя срок вклада в месяцах
        System.out.print("Введите срок вклада в месяцах: ");
        int depositTerm = scanner.nextInt();

        // Процентная ставка
        final float interestRate = 0.07f;

        // Расчет итоговой суммы с использованием цикла
        for (int month = 1; month <= depositTerm; month++) {
            initialDeposit += initialDeposit * interestRate; // Увеличиваем сумму вклада на процент
        }

        // Выводим итоговую сумму вклада
        System.out.printf("После %d месяцев сумма вклада составит %.2f%n", depositTerm, initialDeposit);

        // Закрываем Scanner
        scanner.close();
    }
//     Расчет с использованием цикла while
//        while (month <= depositTerm) {
//        initialDeposit += initialDeposit * interestRate; // Увеличиваем сумму вклада на процент
//        month++; // Переходим к следующему месяцу
    }

//////       Cars car = new Cars("Mersedes",2020 );
//////        car.carsOptions();
//////        car.model= "BMW";
//////        car.years = 2023;
//////        car.carsOptions();
////        Cars car = new Cars ("Audi",2019);
////        Cars car1 = new Cars ("Ferrari",2010);
////        car.makeBeBe();
////        car.model = "Ваз";
////        car.years = 2000;
////        car1.makeBeBe();
////        car1.model = "Mercedes";
////        car1.years = 2025;
////        car.makeBeBe();
////        car1.makeBeBe();
//    }
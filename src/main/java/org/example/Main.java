package org.example;

    public class Main {
        public static void main(String[] args) {
            String[] arrayOne = new String[3];
            arrayOne[0] = "привет";
            arrayOne[1] = "ПОКА";
            arrayOne[2] = "гипербола";
            int randomIndex = RandomIndex();
            String array = arrayOne[randomIndex];
            System.out.println("Рандомное число: " + randomIndex + " Слово из массива: " + array);
        }
        //Метод для генерации случайного числа от 0 до 2//
        public static int RandomIndex() {
            return (int) (Math.random() * 3);
        }
    }

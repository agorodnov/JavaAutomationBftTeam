package org.example;

public class Main {
    public static void main (String[] args) {
        String[] arrayOne = new String[3];
        arrayOne[0] = "привет";
        arrayOne[1] = "ПОКА";
        arrayOne[2] = "гипербола";
        String привет = arrayOne[0].toUpperCase();
        System.out.println(привет);
        String пока = arrayOne[1].toLowerCase();
        System.out.println(пока);
        String гипербола = arrayOne[2];
        System.out.println(гипербола);
        StringBuilder stbuild = new StringBuilder(arrayOne[1]);
        stbuild.insert(1,' ');
        stbuild.insert(3,' ');
        System.out.println(stbuild);
    }
}
package org.example;

public class Main {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.play (MusicalInstruments.Instruments.GUITAR.getStringCount());
        piano.play(MusicalInstruments.Instruments.PIANO.getStringCount());
    }
}
package ru.job4j.oop;

public class Traffic {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle train = new Train();
        Vehicle aircraft = new Aircraft();

        Vehicle[] transport = {bus, train, aircraft};

        for (Vehicle item : transport) {
            item.move();
        }
    }
}

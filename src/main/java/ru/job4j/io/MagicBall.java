package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        int answer = new Random().nextInt(3);
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();

        switch (answer) {
            case 0 -> System.out.println("Да");
            case 1 -> System.out.println("Нет");
            case 2, 3 -> System.out.println("Может быть");
        }
    }
}

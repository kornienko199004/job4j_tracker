package ru.job4j.tasks;

import java.util.stream.IntStream;

public class ArraysTasks {
    public static void main(String[] args) {
        int[] left = { 1, 3 };
        int[] right = { 1, 2 };
        for (int value : left) {
            if (IntStream.of(right).anyMatch(x -> x == value)) {
                System.out.println(value);
            }
        }
    }
}

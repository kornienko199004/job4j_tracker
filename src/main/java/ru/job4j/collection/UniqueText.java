package ru.job4j.collection;

import java.util.Collections;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();

        Collections.addAll(check, origin);

        for (String item : text) {
            if (!check.contains(item)) {
                return false;
            }
        }
        return true;
    }
}
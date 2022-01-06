package ru.job4j.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("test@mail.ru", "Ivanov Ivan Ivanovich");
        map.put("test2@mail.ru", "Petrov Ivan Ivanovich");

        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
    }
}

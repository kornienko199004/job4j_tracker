package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Иван Иванович");
        student.setGroup("Группа №1");
        student.setStartDate("01.09.2021");

        System.out.println(student.getFio() + " " + student.getGroup() + " " + student.getStartDate());
    }
}

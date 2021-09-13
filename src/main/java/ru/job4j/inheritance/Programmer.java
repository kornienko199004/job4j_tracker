package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private boolean knowJava = true;

    public Programmer(String name, String surname, String education, String birthday, boolean knowMath, boolean knowJava) {
        super(name, surname, education, birthday, knowMath);
        this.knowJava = knowJava;
    }

    public boolean getKnowJava() {
        return this.knowJava;
    }
}

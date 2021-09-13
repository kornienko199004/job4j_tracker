package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean knowMath = true;

    public Engineer(String name, String surname, String education, String birthday, boolean knowMath) {
        super(name, surname, education, birthday);
        this.knowMath = knowMath;
    }

    public boolean getMathKnowing() {
        return this.knowMath;
    }
}

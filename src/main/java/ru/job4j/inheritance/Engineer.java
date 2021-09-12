package ru.job4j.inheritance;

public class Engineer extends Profession {
    private boolean knowMath = true;

    public boolean getMathKnowing() {
        return this.knowMath;
    }
}

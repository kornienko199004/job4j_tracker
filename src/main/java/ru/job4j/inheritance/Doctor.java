package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean canTreat = true;

    public boolean getCanTreat() {
        return this.canTreat;
    }
}

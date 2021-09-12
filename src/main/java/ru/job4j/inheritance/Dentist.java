package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private boolean canRemoveTooth = true;

    public boolean getCanRemoveTooth() {
        return this.canRemoveTooth;
    }
}

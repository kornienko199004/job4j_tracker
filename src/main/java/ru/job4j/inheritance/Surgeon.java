package ru.job4j.inheritance;

public class Surgeon extends Doctor {
    private boolean canMakeOperations = true;

    public boolean getCanMakeOperations() {
        return this.canMakeOperations;
    }
}

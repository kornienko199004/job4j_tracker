package ru.job4j.inheritance;

public class Doctor extends Profession {
    private boolean canTreat = true;

    public Doctor(String name, String surname, String education, String birthday, boolean canTreat) {
        super(name, surname, education, birthday);
        this.canTreat = canTreat;
    }

    public boolean getCanTreat() {
        return this.canTreat;
    }
}

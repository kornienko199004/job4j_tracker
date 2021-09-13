package ru.job4j.inheritance;

public class Builder extends Engineer {
    private boolean canUseHammer = true;

    public Builder(String name, String surname, String education, String birthday, boolean knowMath, boolean knowJava) {
        super(name, surname, education, birthday, knowMath);
        this.canUseHammer = canUseHammer;
    }

    public boolean getCanUseHammer() {
        return this.canUseHammer;
    }
}

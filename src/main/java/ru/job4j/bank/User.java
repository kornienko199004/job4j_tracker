package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя
 * @author ALEKSEY KORNIENKO
 * @version 1.0
 */
public class User {
    private String passport;
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает пароль пользователя
     * @return паспорт пользователя
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод устанавливает паспорт пользователя
     * @param passport паспорт пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает пароль пользователя
     * @return имя пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод устанавливает имя пользователя
     * @param username имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}
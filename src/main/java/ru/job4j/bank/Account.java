package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает аккаунт пользователя
 * @author ALEKSEY KORNIENKO
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты аккаунта
     * @return requisite реквизиты аккаунта
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод устанавливает реквизиты аккаунта
     * @param requisite реквизиты аккаунта
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс аккаунта
     * @return balance баланс аккаунта
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод устанавливает баланс аккаунта
     * @param balance баланс аккаунта
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}
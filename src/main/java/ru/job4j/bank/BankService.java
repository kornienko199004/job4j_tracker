package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу сервиса банка
 * @author ALEKSEY KORNIENKO
 * @version 1.0
 */
public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет в список,
     * если такого пользователя еще нет в списке.
     * @param user пользователь, который добавляется в список
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет пользователю новый аккаунт,
     * если находит пользователя по паспорту
     * @param passport паспорт пользователя
     * @param account аккаунт пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     *  Метод ищет пользователя по паспорту
     * @param passport паспорт пользователя
     * @return user пользователь
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     *  Метод ищет аккаунт по реквизиту
     * @param passport паспорт пользователя
     * @param requisite реквизиты аккаунта
     * @return account аккаунт
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);

        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     *  Метод переводит деньги с одного аккаунта,
     *  на другой
     * @param srcPassport паспорт пользователя источника
     * @param srcRequisite реквизиты аккаунта источника
     * @param destPassport паспорт пользователя назначения
     * @param destRequisite реквизиты аккаунта назначения
     * @param amount сумма для перевода
     * @return {@code true} если деньги переведены
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account scrAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);

        if (scrAccount != null && destAccount != null && scrAccount.getBalance() >= amount) {
            scrAccount.setBalance(scrAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }

        return rsl;
    }
}
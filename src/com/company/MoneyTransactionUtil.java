package com.company;

public class MoneyTransactionUtil {

    public MoneyTransactionUtil() {
    }

    public static void sendTo(int number1, int number2, int sum) throws AccountException, MoneyValueException {
        if (number1 == number2) {
            throw new AccountException();
        } else if (sum <= 0 || sum > 100_000) {
            throw new MoneyValueException();
        } else {
            System.out.println("Сумма " + sum + " со счета " + number1 +
                    " успешно переведена на счет " + number2);
        }
    }
}

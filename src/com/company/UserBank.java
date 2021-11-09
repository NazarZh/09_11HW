package com.company;

public class UserBank {
    public static void main(String[] args) {
        try {
            MoneyTransactionUtil.sendTo(123456,9999999,100);
            MoneyTransactionUtil.sendTo(123456,9999999,100_000_000);
            MoneyTransactionUtil.sendTo(123456,123456,10_000);
        } catch (AccountException e){
            System.out.println("Ошибка с реквизитами банка. Возможно, номер " +
                    "карты отправителя и получателя совпадают");
        } catch (MoneyValueException e){
            System.out.println("Ошибка с суммой отправки. Сумма должна быть " +
                    "больше 0. Сумма не должна превышать лимит в 100 000");
        }
    }
}

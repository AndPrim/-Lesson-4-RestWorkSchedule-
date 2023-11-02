package ru.netology.services.RestWorkSchedule.services;

public class CalcOfMonthsOfRest {

    public int calcMonthRest(int income, int expenses, int threshold) {
        //income = Зарабатываем в месяц
        //expenses = Траты в месяц
        //threshold = Денег на счету
        int count = 0;
        int moneyAccount = 0;
        for (int month = 0; month < 12; month++) {
            if (moneyAccount >= threshold) {
                count++;
                moneyAccount = (moneyAccount - expenses) / 3;
            } else {
                moneyAccount = moneyAccount + income - expenses;
            }
        }
        return count;
    }
}

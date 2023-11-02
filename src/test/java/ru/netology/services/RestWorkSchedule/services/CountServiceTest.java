package ru.netology.services.RestWorkSchedule.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class CountServiceTest {
    @Test
    void calculationOfTheNumberOfMonthsOfRest() {
        CalcOfMonthsOfRest service = new CalcOfMonthsOfRest();

        int threshold = 20_000;
        int expenses = 3_000;
        int income = 10_000;
        int realCount = 3;

        int actualCount = service.calcMonthRest(income, expenses, threshold);

        Assertions.assertEquals(realCount, actualCount);
    }

    @Test
    void calculationOfTheNumberOfMonthsOfRestTwo() {
        CalcOfMonthsOfRest service = new CalcOfMonthsOfRest();

        int threshold = 150_000;
        int expenses = 60_000;
        int income = 100_000;
        int realCount = 2;

        int actualCount = service.calcMonthRest(income, expenses, threshold);

        Assertions.assertEquals(realCount, actualCount);
    }
}

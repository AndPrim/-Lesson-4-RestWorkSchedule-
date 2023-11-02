package ru.netology.services.RestWorkSchedule.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


public class CountServiceTest {
    @ParameterizedTest
    @CsvSource({
            "20000,3000,10000,3",
            "150000,60000,100000,2"
    })
    void calculationOfTheNumberOfMonthsOfRest(int threshold, int expenses, int income, int realCount) {
        CalcOfMonthsOfRest service = new CalcOfMonthsOfRest();

        //int threshold = 20_000;
        //int expenses = 3_000;
        //int income = 10_000;
        //int realCount = 3;

        int actualCount = service.calcMonthRest(income, expenses, threshold);

        Assertions.assertEquals(realCount, actualCount);
    }

    /*@Test
    void calculationOfTheNumberOfMonthsOfRestTwo() {
        CalcOfMonthsOfRest service = new CalcOfMonthsOfRest();

        int threshold = 150_000;
        int expenses = 60_000;
        int income = 100_000;
        int realCount = 2;

        int actualCount = service.calcMonthRest(income, expenses, threshold);

        Assertions.assertEquals(realCount, actualCount);
    }*/
}

package ru.netogy.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    public void TotalAllSales() { //сумма всех продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAmountMonth = 180;
        int actualAmountMonth = service.salesAmount(sales);

        Assertions.assertEquals(expectedAmountMonth, actualAmountMonth);
    }

    @Test
    public void averageSalesAmount() { //средняя сумма продаж в месяц
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverageMonth = 15;
        int actualAverageMonth = service.averageAmount(sales);

        Assertions.assertEquals(expectedAverageMonth, actualAverageMonth);
    }

    @Test
    public void maxMonthSales() { //пик продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonth = 6;
        int actualMaxMonth = service.maxMonth(sales);

        Assertions.assertEquals(expectedMaxMonth, actualMaxMonth);
    }

    @Test
    public void minMonthSales() { //min продаж
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 9;
        int actualMinMonth = service.minMonth(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void quantitySalesBelowAverage() { //кол-во месяцев продаж меньше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinMonth = 5;
        int actualMinMonth = service.lessThanAverage(sales);

        Assertions.assertEquals(expectedMinMonth, actualMinMonth);
    }

    @Test
    public void quantitySalesHigherAverage() { //кол-во месяцев продаж больше среднего
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxMonthAverage = 5;
        int actualMinMaxAverage = service.moreThanAverage(sales);

        Assertions.assertEquals(expectedMaxMonthAverage, actualMinMaxAverage);
    }
}


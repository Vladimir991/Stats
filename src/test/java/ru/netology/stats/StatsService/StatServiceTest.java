package ru.netology.stats.StatsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatServiceTest {
    @Test
    // 1 Сумма всех продаж
    public void shouldFindSumAllSales() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedSumAllSales = 180;
        long actualSumAllSales = service.sumAllSales(sale);

        Assertions.assertEquals(expectedSumAllSales, actualSumAllSales);
    }

    @Test
    // 2 Средняя сумма продаж в месяц
    public void shouldFindAverageSum() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;
        long actualAverageSum = service.averageSumSales(sale);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    // 3 Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму
    public void shouldFindMaxSalesInMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMaxSales = 8;
        long actualMaxSales = service.maxSales(sale);

        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    // 4 Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму
    public void shouldFindMinSalesInMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedMinSales = 9;
        long actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    // 5 Количество месяцев, в которых продажи были ниже среднего
    public void shouldFindAllLowerMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedLowMonth = 5;
        long actualLowMonth = service.lowSales(sale);

        Assertions.assertEquals(expectedLowMonth, actualLowMonth);
    }

    @Test
    // 6 Количество месяцев, в которых продажи были выше среднего
    public void shouldFindAllHigherMonth() {
        StatsService service = new StatsService();
        long[] sale = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expectedHighMonth = 5;
        long actualHighMonth = service.highSales(sale);

        Assertions.assertEquals(expectedHighMonth, actualHighMonth);
    }
}

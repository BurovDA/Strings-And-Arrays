package ru.netogy.stats;

public class StatsService {

    public int salesAmount(long[] sales) { //сумма всех продаж
        long amountMonth = 0;
        for (long i : sales) {
            amountMonth = amountMonth + i;
        }
        return (int) amountMonth;
    }

    public int averageAmount(long[] sales) { //средняя сумма продаж в месяц
        int averageMonth = salesAmount(sales) / sales.length;
        return averageMonth;
    }

    public int maxMonth(long[] sales) { // месяц максимальных продаж
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minMonth(long[] sales) { // месяц минимальных продаж
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int lessThanAverage(long[] sales) { // продажи ниже средннго
        long qualityMinMonths = averageAmount(sales);
        int countMinMonths = 0;
        for (long month : sales) {
            if (month < qualityMinMonths) {
                countMinMonths++;
            }
        }
        return countMinMonths;
    }

    public int moreThanAverage(long[] sales) { // продажи выше средннго
        long qualityMaxMonths = averageAmount(sales);
        int countMaxMonths = 0;
        for (long month : sales) {
            if (month > qualityMaxMonths) {
                countMaxMonths++;
            }
        }
        return countMaxMonths; 
    }

}


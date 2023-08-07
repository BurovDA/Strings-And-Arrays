package ru.netogy.stats;

public class StatsService {

    public int salesAmount(long[] sales) { //сумма всех продаж
        long amountMonth = 0; // номер первого месяца
        for (long i : sales) {
            amountMonth = amountMonth + i;
        }
        return (int) amountMonth;//
    }

    public int averageAmount(long[] sales) { //средняя сумма продаж в месяц
        int averageMonth = salesAmount(sales) / sales.length;
        return averageMonth; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int maxMonth(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж больше
                maxMonth = i; // запомним его как минимальный
            }
        }
        return maxMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minMonth(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int lessThanAverage(long[] sales) { // продажи ниже средннго
        long qualityMinMonths = averageAmount(sales);
        int countMinMonths = 0;
        for (long month : sales) {
            if (month < qualityMinMonths) {
                countMinMonths++;
            }
        }
        return countMinMonths; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int moreThanAverage(long[] sales) { // продажи ниже средннго
        long qualityMaxMonths = averageAmount(sales);
        int countMaxMonths = 0;
        for (long month : sales) {
            if (month > qualityMaxMonths) {
                countMaxMonths++;
            }
        }
        return countMaxMonths; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

}


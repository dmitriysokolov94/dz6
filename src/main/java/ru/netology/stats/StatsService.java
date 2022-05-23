package ru.netology.stats;

class StatsService {

    public int summSalers(long[] sales) {
        int summ = 0;
        for (long sale : sales) {
            summ += sale;
        }
        return summ;
    }

    public int meanYear(long[] sales) {
        return summSalers(sales) / sales.length;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;

    }

    public int lessThanAverage(long[] sales) {
        long avg = meanYear(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > avg) {
                count ++;
            }
        }
        return count;
    }

    public int aboveAverage(long[] sales) {
        long avg = meanYear(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < avg) {
                count++;
            }
        }
        return count;
    }


}

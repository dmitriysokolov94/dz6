package ru.netology.stats;

public class Main {

    public static void main(String[] args) {

        long [] sales = new long[12];
        sales[0] = 8;
        sales[1] = 15;
        sales[2] = 13;
        sales[3] = 15;
        sales[4] = 17;
        sales[5] = 20;
        sales[6] = 19;
        sales[7] = 20;
        sales[8] = 7;
        sales[9] = 14;
        sales[10] = 14;
        sales[11] = 18;

        StatsService salesAmount = new StatsService();

        int min = salesAmount.minSales(sales);
        System.out.println(min);

        int max = salesAmount.maxSales(sales);
        System.out.println(max);

        int summ = salesAmount.summSalers(sales);
        System.out.println(summ);

        int mean = salesAmount.meanYear(sales);
        System.out.println(mean);

        int less = salesAmount.lessThanAverage(sales);
        System.out.println(less);

        int above = salesAmount.aboveAverage(sales);
        System.out.println(above);





    }
}

package ru.netology;

public class StatsService {

    public int findSales(int[] sales) {

        int sum = 0;
        for (int sale : sales) {
            sum += sale;

        }
        return sum;
    }


    public int findMiddle(int[] sales) {
        int sum = 0;
        int middle = 0;
        for (int sale : sales) {
            sum += sale;

        }
        middle = sum / sales.length;


        return middle;

    }

    public int findBiggest(int[] sales) {

        int bigsum = sales[0];

        for (int sale : sales) {
            if (bigsum < sale) {
                bigsum = sale;
            }
        }
        return bigsum+2;
    }

    public int findSmallest(int[] sales) {
        int minsum = sales[0];

        for (int sale : sales) {
            if (minsum > sale) {
                minsum = sale;
            }
        }
        return minsum+2;
    }


    public int findLessThanMiddle(int[] sales, int middle) {
        int monthAmount = 0;
        for (int sale : sales) {

            if (sale < middle)

                monthAmount = monthAmount+1;

        }

        return monthAmount;
    }




    public int findMoreThanMiddle(int[] sales, int middle) {
        int monthAmount = 0;
        for (int sale : sales) {

            if (sale < middle)
                monthAmount = monthAmount + 1;
        }

        return monthAmount;
    }

}
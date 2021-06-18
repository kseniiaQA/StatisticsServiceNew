package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {


    @org.junit.jupiter.api.Test
    void findSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.findSales(sales);

        assertEquals(expected, actual);

    }


    @org.junit.jupiter.api.Test
    void findMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.findMiddle(sales);
        assertEquals(expected, actual);


    }


    @org.junit.jupiter.api.Test
    void findBiggest() {

        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected1 = 6;
        int expected2 = 8;


        int actual = service.findBiggest(sales);

        assertEquals(expected1, expected2, actual);

    }


    @org.junit.jupiter.api.Test
    void findSmallest() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        int actual = service.findSmallest(sales);
        assertEquals(expected, actual);


    }


    @Test
    void findLessThanMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int middle=15;

        int actual = service.findLessThanMiddle(sales, middle);
        assertEquals(expected, actual);


    }

    @Test
    void findMoreThanMiddle() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;


        int middle=15;
        int actual = service.findMoreThanMiddle(sales, middle);
        assertEquals(expected, actual);


    }
}

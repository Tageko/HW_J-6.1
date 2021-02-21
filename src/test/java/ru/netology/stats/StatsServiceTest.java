package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    int[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
    StatsService service = new StatsService();

    @Test
    void shouldSum() {
        int expected = 180;
        int actual = service.sum(purchases);
        assertEquals(expected, actual);
    }

    @Test
    void shouldAverage() {
        assertEquals(15, service.avg(purchases));
    }

    @Test
    void shouldReturnMountWithMax() {
        assertEquals(8, service.monthWithMax(purchases));
    }

    @Test
    void shouldReturnMountWithMin() {
        assertEquals(9, service.monthWithMin(purchases));
    }

    @Test
    void shouldReturnMountCountMoreThanAverage() {
        assertEquals(5, service.MountCountMoreAverage(purchases));
    }

    @Test
    void shouldReturnMountCountLessThanAverage() {
        assertEquals(5, service.MountCountLessAverage(purchases));
    }
}
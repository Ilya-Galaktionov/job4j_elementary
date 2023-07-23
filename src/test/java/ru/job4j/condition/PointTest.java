package ru.job4j.condition;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void when00To20Then2() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 0);
        double expected = 2;
        double out = start.distance(end);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when20To50Then3() {
        Point start = new Point(2, 0);
        Point end = new Point(5, 0);
        double expected = 3;
        double out = start.distance(end);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void when100To20Then8() {
        Point start = new Point(10, 0);
        Point end = new Point(2, 0);
        double expected = 8;
        double out = start.distance(end);
        assertEquals(expected, out, 0.01);
    }
}
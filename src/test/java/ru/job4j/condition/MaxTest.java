package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    public void whenMax12ToThen2() {
        Max maxNumber = new Max();
        int result = maxNumber.max(1, 2);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax123ToThen3() {
        Max maxNumber = new Max();
        int result = maxNumber.max(1, 2, 3);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1234ToThen4() {
        Max maxNumber = new Max();
        int result = maxNumber.max(1, 2, 3, 4);
        int expected = 4;
        assertThat(result).isEqualTo(expected);
    }
}

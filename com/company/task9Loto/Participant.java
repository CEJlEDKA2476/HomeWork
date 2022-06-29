package com.company.task9Loto;

import java.util.Objects;

/**
 * This class about your players
 */
public class Participant {
    private final Integer[] numbers;

    Participant(Integer[] numbers) {
        this.numbers = numbers;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    public Integer[] getNumbers() {
        return numbers;
    }
}

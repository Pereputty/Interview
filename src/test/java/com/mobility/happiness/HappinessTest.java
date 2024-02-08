package com.mobility.happiness;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

import com.mobility.EvilTest;

@EvilTest
public class HappinessTest {

    private Happiness happiness;

    @Test
    public void shouldReturnOne() {
        int[] numbers = {1, 5, 3};
        Set<Integer> likes = new HashSet<>(Arrays.asList(3, 1));
        Set<Integer> dislikes = new HashSet<>(Arrays.asList(5, 7));

        int result = happiness.getLevel(numbers, likes, dislikes);

        assertEquals(1, result);
    }

    @Test
    public void shouldReturnMinusOne() {
        int[] numbers = {2, 3, 5, 7};
        Set<Integer> likes = new HashSet<>(Arrays.asList(3, 1));
        Set<Integer> dislikes = new HashSet<>(Arrays.asList(5, 7));

        int result = happiness.getLevel(numbers, likes, dislikes);

        assertEquals(-1, result);
    }

    @Test
    public void shouldReturnZero() {
        int[] numbers = {};
        Set<Integer> likes = new HashSet<>(Arrays.asList(3, 1));
        Set<Integer> dislikes = new HashSet<>(Arrays.asList(5, 7));

        int result = happiness.getLevel(numbers, likes, dislikes);

        assertEquals(0, result);
    }

}

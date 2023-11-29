package com.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MajorityElementTest {
    @Test
    public void testFindMajorityElement() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 3,3,1,1,1,3,3 };
        int expected = 3;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingNegativeValues() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 1, 2, 3, 4, 5, -5, -5, -5, -5 };
        int expected = -5;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingZero() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 1, 2, 3, 4, 5, 0, 0, 0, 0 };
        int expected = 0;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingEmptyArray() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { };
        int expected = 0;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingNull() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = null;
        int expected = 0;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingOneElement() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 1 };
        int expected = 1;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingTwoElements() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 1, 1 };
        int expected = 1;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingThreeElements() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 4, 2, 4 };
        int expected = 4;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }

    @Test
    public void testUsingLargeNumbers() {
        MajorityElement majorityElement = new MajorityElement();
        int[] nums = { 1000000000, 1000000000, 1000000000 };
        int expected = 1000000000;
        int actual = majorityElement.findMajorityElement(nums);
        assertEquals(expected, actual);
    }
}
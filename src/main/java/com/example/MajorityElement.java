package com.example;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MajorityElement {
    public static void main(String[] args) {
        System.out.println("Enter the array of elements separated by 1 whitespace: ");
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        System.out.println("Majority element is: " + new MajorityElement().findMajorityElement(nums));
    }

    public int findMajorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        if(nums == null || nums.length == 0){
            return 0;
        }
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num)+1);
            } else {
                map.put(num, 1);
            }
        }
        int maxValue =  Collections.max(map.entrySet(), Map.Entry.comparingByValue()).getValue();
        return map.entrySet().stream().filter(entry -> entry.getValue() == maxValue).max(Map.Entry.comparingByKey()).get().getKey();
    }
}
package com.leet.arrays.easy;

import java.util.*;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));;
    }

    static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if ( map.containsKey(target - nums[i]))
                return new int[] {map.get(target - nums[i]), i};
            map.put(nums[i], i);
        }
        return null;
    }
}

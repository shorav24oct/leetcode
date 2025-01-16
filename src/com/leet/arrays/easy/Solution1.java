package com.leet.arrays.easy;

/*
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        twoSum(nums, target);
    }

    static void twoSum(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low < high) {
            if (nums[low] + nums[high] == target) {
                System.out.println("[" + low + ", " + high + "]");
                low++;
                high--;
            }
            if (nums[low] + nums[high] > target)
                high--;
            if (nums[low] + nums[high] < target)
                low++;
        }
    }
}

package com.leet.arrays.easy;

import java.util.Arrays;

/*
remove-duplicates-from-sorted-array
return the number of unique elements in nums.
 */
public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2};
        System.out.println(removeDuplicates(nums));
    }

    /*
    Naive Solution
     */
    static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        int res = 1;

        for (int i = 1; i < nums.length; i++)
            if (temp[res - 1] != nums[i]) {
                temp[res] = nums[i];
                res++;
            }

        System.out.println(Arrays.toString(temp));

        return temp.length;
    }
}

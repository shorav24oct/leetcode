package com.leet.arrays.easy;


/*
remove-duplicates-from-sorted-array
return the number of unique elements in nums.
 */
public class Solution26 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(removeDuplicates2(nums));
    }

    /*
    Naive Solution
     */
    static int removeDuplicates(int[] nums) {
        int[] temp = new int[nums.length];
        temp[0] = nums[0];
        int res = 1;
        int count = 0;

        for (int i = 1; i < nums.length; i++)
            if (temp[res - 1] != nums[i]) {
                temp[res] = nums[i];
                res++;
            }

        return res;
    }

    /*
    Efficient solution
     */
    static int removeDuplicates2(int[] nums) {
        int res = 1;

        for (int i = 0; i < nums.length; i++)
            if (nums[res - 1] != nums[i]) {
                nums[res] = nums[i];
                res++;
            }

        return res;
    }
}

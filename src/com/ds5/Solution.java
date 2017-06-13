package com.ds5;

/**
 * Created by dbhattac on 4/24/2017.
 */
public class Solution {
    public static int singleNonDuplicate(int[] nums) {
        if(nums.length == 0 ) return -1;
        if(nums.length == 1) return nums[0];
        for(int i =1; i < nums.length ;i+=2)
        {
            if((nums[i] - nums[i-1]) != 0) return nums[i-1];
        }

        return nums[nums.length-1];

    }
    public static void main(String args[])
    {
        int nums[]= {0,1,1};
        System.out.print(Solution.singleNonDuplicate(nums));
    }
}

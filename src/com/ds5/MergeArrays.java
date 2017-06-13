package com.ds5;

/**
 * Created by dbhattac on 4/22/2017.
 */
public class MergeArrays {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
       int k = nums1.length-1;
        int i  = nums1.length- nums2.length -1, j = nums2.length-1;
        while(i>=0 && j >= 0 )
        {
            if(nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else
                nums1[k--] =nums2[j--];

        }
        while(j >=0)
            nums1[k--] = nums2[j--];

        for(int ii :nums1)
            System.out.print(ii + " , ");
    }

    public static void main(String args[])
    {
        MergeArrays obj = new MergeArrays();
        int nums1[] =  {0,0,0};
        int nums2[] = {2,3,4};
        obj.merge(nums1,0,nums2,2);

    }
}

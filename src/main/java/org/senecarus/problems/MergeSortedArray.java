package org.senecarus.problems;

import java.util.Arrays;
import java.util.HashSet;

public class MergeSortedArray {
    public static int[] mergeWithExtraArray(int[] nums1, int m, int[] nums2, int n) {

        int[] res = new int[m + n];
        int i1 = 0;
        int i2 = 0;

        for (int i = 0;  i < m + n; i++) {
            if (i1 < m && (i2 >= n || nums1[i1] <= nums2[i2])) {
                res[i] = nums1[i1++];

            } else {
                res[i] = nums2[i2++];

            }

        }
        System.arraycopy(res, 0, nums1, 0, res.length);
        return nums1;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        //variables to work as pointers
        int i=m-1; // will point at m-1 index of nums1 array
        int j=n-1; // will point at n-1 index of nums2 array
        int k=nums1.length-1; //will point at the last position of the nums1 array

        // Now traversing the nums2 array
        while(j>=0){
            // If element at i index of nums1 > element at j index of nums2
            // then it is largest among two arrays and will be stored at k position of nums1
            // using i>=0 to make sure we have elements to compare in nums1 array
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--; //updating pointer for further comparisons
            }else{
                // element at j index of nums2 array is greater than the element at i index of nums1 array
                // or there is no element left to compare with the nums1 array
                // and we just have to push the elements of nums2 array in the nums1 array.
                nums1[k] = nums2[j];
                k--;
                j--; //updating pointer for further comparisons
            }
        }
        return nums1;
    }
}

// less code

//    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        int i = m - 1;
//        int j = n - 1;
//        int k = m + n - 1;
//        while (j >= 0)
//            if (i >= 0 && nums1[i] > nums2[j])
//              nums1[k--] = nums1[i--];
//            else
//              nums1[k--] = nums2[j--];
//    }
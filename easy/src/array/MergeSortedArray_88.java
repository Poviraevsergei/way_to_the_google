package array;

import java.util.Arrays;

public class MergeSortedArray_88 {

    /*
    Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.
    The number of elements initialized in nums1 and nums2 are m and n respectively.
    You may assume that nums1 has a size equal to m + n such that it has enough space to hold additional elements from nums2.

    Steps:
    1. merge arrays;
    2. sort result array;
     */

    public static void main(String[] args) {
        for (int i : merge(new int[]{1, 9, 3, 0, 0, 0}, 3, new int[]{7, 2, 0}, 3)) {
            System.out.println(i);
        }
    }

    static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i : nums2) {
            nums1[m] = i;
            m++;
        }
        Arrays.sort(nums1);
        return nums1;
    }
}
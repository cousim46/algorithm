package week1;

import java.util.Arrays;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num2Index = 0;
        for(int i = m; i < m+n; i++) {
            if(num2Index <= n -1) {
                nums1[i] = nums2[num2Index];
                num2Index++;
            }
        }
        Arrays.sort(nums1);
    }

}

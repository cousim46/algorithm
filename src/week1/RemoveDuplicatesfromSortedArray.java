package week1;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        List<Integer> duplicateNums = new ArrayList();
        int count = 0;
        int index = 0;
        for(int num : nums) {
            if(!duplicateNums.contains(num)) {
                duplicateNums.add(num);
                nums[index] = num;
                index++;
                count++;
            }
        }
        return count;
    }

}

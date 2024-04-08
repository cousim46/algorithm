package week1;

public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int index = 0;
        for(int num : nums) {
            if(num != val) {
                nums[index] = num;
                index++;
                count++;
            }
        }
        return  count;
    }

    public static void main(String[] args) {
        RemoveElement removeElement = new RemoveElement();
        int[] num = {3,2,2,3};
        int v = 3;
        System.out.println("removeElement = " + removeElement.removeElement(num,v));
    }

}

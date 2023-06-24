public class Q2 {

    static int removeElement(int[] nums, int val) {

        int count = 0;
        for(int i = 0; i <  nums.length; i++){
            if(nums[i] != val){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        int [] nums = {3,2,2,3,5,6};
        int val = 2;
        System.out.println(removeElement(nums, val));
    }
}

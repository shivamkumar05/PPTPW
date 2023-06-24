import java.util.Arrays;
public class Q8 {

    static int[] findErrorNums(int[] nums) {
        int dupli = 0, missing = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == nums[i+1]){
                dupli = nums[i];
                missing = nums[i] + 1;
                break;
            }
        }
        int [] arr = {dupli, missing};
        return arr;

    }

    public static void main(String[] args) {
        int [] nums = {1,2,3,3,5,6};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }
}

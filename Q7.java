import java.util.Arrays;

public class Q7 {
    static void moveZeroes(int[] nums) {

        int n = nums.length;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++)
                if(nums[j] != 0){
                    int temp =  nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;
                    i++;
                }
        }
        System.out.println(Arrays.toString(nums));


    }

    public static void main(String[] args) {

        int [] nums = {0,0,0,1,0,3,12,15,32,0};
        moveZeroes(nums);

    }

}

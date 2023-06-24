import java.util.Scanner;

public class Q1 {
         static int[] twoSum(int[] nums, int target) {
            for(int i = 0; i < nums.length; i++){
                for(int j = i+1; j < nums.length; j++){
                    if(nums[i] + nums[j] == target){
                        return new int[] {i,j};
                    }
                }
            }
            return null;
        }

        static void printArray(int arr[]){

            if(arr == null){
                System.out.println("Null");
                return ;
            }

            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of an Array");
            int l = sc.nextInt();

            int nums [] = new int [l];

            System.out.println("Enter elements");
            for(int i = 0; i < nums.length; i++){
                nums[i] = sc.nextInt();
            }

            System.out.println("Enter target");
            int x = sc.nextInt();

            printArray(twoSum(nums, x));

        }
    }


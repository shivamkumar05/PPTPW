import java.util.Arrays;

public class Q5 {


        static void merge(int[] nums1, int m, int[] nums2, int n) {

            int last = m + n - 1;
            while(m > 0 && n > 0){
                if(nums1[m-1] > nums2[n-1]){
                    nums1[last] = nums1[m-1];
                    m--;
                }
                else{
                    nums1[last] = nums2[n-1];
                    n--;
                }
                last--;
            }
            while(n > 0){
                nums1[last] = nums2[n-1];
                n--;
                last--;
            }
            System.out.println(Arrays.toString(nums1));
        }

        public static void main(String[] args) {

            int [] nums1 = {0};
            int [] nums2 = {1};

            int m = 0,  n = 1;

            // int [] nums1 = {2,2,3,0,0,0};
            // int [] nums2 = {1,5,6};
            // int m = 3, n = 3; //repesting number of elements in num1 and nums2 resp.

            merge(nums1, m, nums2, n);
        }
}

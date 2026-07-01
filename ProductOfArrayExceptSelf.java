import java.util.Arrays;

public class ProductOfArrayExceptSelf {
    private static int[] productExceptSelf(int[] nums){
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, 1);
        int l = 1;
        for(int i = 0; i < n; i++){
            ans[i] = l;
            l *= nums[i];
        }
        int r = 1;
        for(int i = n - 1; i >= 0; i--){
            ans[i] *= r;
            r *= nums[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6};
        int[] ans = productExceptSelf(nums);
        for(int i = 0; i < ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }
}

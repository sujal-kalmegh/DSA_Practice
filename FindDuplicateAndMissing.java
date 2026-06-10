import java.util.ArrayList;

public class FindDuplicateAndMissing {
    public static ArrayList<Integer> duplicateAndMissing(int[] arr){
        long n = arr.length;
        long sum = (n * (n + 1)) / 2;
        long sqSum = (n * (n + 1) * (2 * n + 1)) / 6;
        long arrSum = 0, arrSqSum = 0;
        for(int i = 0; i < n; i++){
            arrSum += arr[i];
            arrSqSum += (long)arr[i] * arr[i];
        }
        long val1 = sum - arrSum;
        long val2 = sqSum - arrSqSum;
        val2 = val2 / val1;
        long x = (val1 + val2) / 2;
        long y = val2 - x;
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add((int)x);
        ans.add((int)y);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {4, 3, 6, 2, 1, 1};
        ArrayList<Integer> list = duplicateAndMissing(arr);
        System.out.println("Missing: " + list.get(0));
        System.out.println("Duplicate: " + list.get(1));
    }
}

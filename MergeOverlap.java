import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeOverlap {
    public static int[][] overlapInterval(int[][] intervals){
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int n = intervals.length;
        List<int[]> list = new ArrayList<>();
        int[] prev = intervals[0];
        for(int i = 1; i < n; i++){
            int[] curr = intervals[i];
            if(prev[1] >= curr[0]){
                prev[1] = Math.max(prev[1], curr[1]);
            }
            else{
                list.add(prev);
                prev = curr;
            }
        }
        list.add(prev);
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < ans.length; i++){
            for(int j = 0; j < 2; j++){
                ans[i][j] = list.get(i)[j];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ans = overlapInterval(intervals);
        for(int i = 0; i < ans.length; i++){
            System.out.println(ans[i][0] + ", " + ans[i][1]);
        }
    }
}

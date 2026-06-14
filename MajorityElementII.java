import java.util.ArrayList;
import java.util.List;

public class MajorityElementII {
    public static List<Integer> majority(int[] arr){
        int n = arr.length, ele1 = 0, ele2 = 0, count1 = 0, count2 = 0;
        for(int i : arr){
            if(count1 == 0 && ele2 != i){
                ele1 = i;
                count1++;
            }
            else if(count2 == 0 && ele1 != i){
                ele2 = i;
                count2++;
            }
            else if(i == ele1){
                count1++;
            }
            else if(i == ele2){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i : arr){
            if(i == ele1){
                count1++;
            }
            if(i == ele2){
                count2++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        if(count1 > n / 3) ans.add(ele1);
        if(count2 > n / 3) ans.add(ele2);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        List<Integer> temp = majority(arr);
        for(int i : temp){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}

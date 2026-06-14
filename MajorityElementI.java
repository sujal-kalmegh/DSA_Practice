//Moore's Voting Algorithm
public class MajorityElementI {
    public static int majorityElement(int[] arr){
        int element = 0, count = 0;
        for(int i : arr){
            if(count == 0){
                element = i;
                count++;
            }
            else if(element == i){
                count++;
            }
            else{
                count--;
            }
        }
        count = 0;
        for(int i : arr){
            if(i == element){
                count++;
            }
        }
        return count > arr.length / 2 ? element : -1;
    }
    public static void main(String[] args) {
        int[] arr = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(arr));
    }
}

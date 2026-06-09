public class FindDuplicate {
    public static int duplicate(int[] arr){
        int slow = 0, fast = 0;
        do{
            slow = arr[slow];
            fast = arr[arr[fast]];
        }
        while(slow != fast);
        slow = 0;
        while(slow != fast){
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,4,2,2};
        System.out.println(duplicate(arr));
    }
}

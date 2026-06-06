public class NextPermutation {
    public static void nextPermutation(int[] arr){
        int n = arr.length;
        int pivot = n - 2;
        while(pivot >= 0 && arr[pivot] >= arr[pivot + 1]){
            pivot--;
        }
        if(pivot >= 0){
            int j = n - 1;
            while(arr[pivot] >= arr[j]){
                j--;
            }
            swap(arr, pivot, j);
        }
        reverse(arr, pivot + 1, n - 1);
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    private static void reverse(int[] arr, int start, int end){
        while(start < end){
            swap(arr, start++, end--);
        }
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 1, 7, 5, 0};
        nextPermutation(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

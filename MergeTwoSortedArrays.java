public class MergeTwoSortedArrays {
    public static void mergeArrays(int[] arr1, int[] arr2, int m, int n){
        int a = m - 1, b = n - 1, i = m + n - 1;
        while(a >= 0 && b >= 0){
            if(arr1[a] >= arr2[b]){
                arr1[i] = arr1[a];
                a--;
            }
            else{
                arr1[i] = arr2[b];
                b--;
            }
            i--;
        }
        while(b >= 0){
            arr1[i] = arr2[b];
            b--;
            i--;
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,0,0,0};
        int[] arr2 = {2,5,6};
        int m = 3, n = 3;
        mergeArrays(arr1, arr2, m, n);
        for(int i = 0; i < arr1.length; i++){
            System.out.print(arr1[i] + " ");
        }
        System.out.println();
    }
}

public class StockBuyAndSell {
    public static int maxProfit(int[] arr){
        int n = arr.length;
        int profit = 0, min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            min = Math.min(min, arr[i]);
            profit = Math.max(profit, arr[i] - min);
        }
        return profit;
    }
    public static void main(String[] args){
        int[] arr = {7,1,5,3,6,4};
        System.out.println(maxProfit(arr));
    }
}

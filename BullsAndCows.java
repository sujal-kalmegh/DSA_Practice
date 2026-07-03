public class BullsAndCows {
    private static String bullsAndCows(String secret, String guess){
        int bull = 0, cow = 0;
        int[] arr = new int[10];
        int n = secret.length();
        for(int i = 0; i < n; i++){
            int s = secret.charAt(i) - '0';
            int g = guess.charAt(i) - '0';
            if(s == g){
                bull++;
            }
            else{
                if(arr[s] > 0) cow++;
                if(arr[g] < 0) cow++;
                arr[s]--;
                arr[g]++;
            }
        }
        return bull + "A" + cow + "B";
    }
    public static void main(String[] args) {
        System.out.println(bullsAndCows("1807", "7810"));
    }
}

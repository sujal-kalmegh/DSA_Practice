public class CountPrimes {
    private static int countPrimes(int n){
        boolean[] isNotPrime = new boolean[n];
        int count = 0;
        for(int i = 2; i < n; i++){
            if(!isNotPrime[i]){
                count++;
            }
            for(long j = (long)i * i; j < n; j += i){
                isNotPrime[(int) j] = true; 
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countPrimes(n));
    }
    
}

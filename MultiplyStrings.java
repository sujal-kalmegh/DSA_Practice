public class MultiplyStrings {
    public static String multiply(String num1, String num2){
        int n = num1.length();
        int m = num2.length();
        int[] arr = new int[m + n];
        for(int i = n - 1; i >= 0; i--){
            int n1 = num1.charAt(i) - '0';
            for(int j = m - 1; j >= 0; j--){
                int n2 = num2.charAt(j) - '0';
                int mul = n1 * n2;
                int pl1 = i + j + 1;
                int pl2 = pl1 - 1;
                int sum = arr[pl1] + mul;
                arr[pl1] = sum % 10;
                arr[pl2] += sum / 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i : arr){
            if(!(sb.length() == 0 && i == 0)){
                sb.append(i);
            }
        }
        return sb.length() == 0 ? "0" : sb.toString();
    }
    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
    
}

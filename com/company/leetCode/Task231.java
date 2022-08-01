package leetCode;

public class Task231 {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(16));
    }

    public static boolean isPowerOfTwo(int n) {
           for(int i = 0; i <= n; i++){
               if(n == Math.pow(2, i)){
                   return true;
               }
           }
           return false;
    }
}

import java.util.HashSet;

public class EvenFibonacci {
    public static HashSet<Integer> nums = new HashSet();
 public static int fibo(int n) {
int sumEven = 0;

     if (n == 1 || n == 2) {
         return 1;
     }
     int result = fibo(n - 1) + fibo(n - 2);
     if(result < 4000000) {
         if (result % 2 == 0) {
             nums.add(result);
         }
     }
     return result;
 }

    public static void main(String[] args) {
        System.out.println(fibo(38));
        System.out.println(nums);
        int sum = 0;
        for (int num:nums) {
            sum = sum+num;
        }
        System.out.println(sum);
    }
}


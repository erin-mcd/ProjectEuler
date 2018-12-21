import java.util.HashSet;

public class Multiples {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet();
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            if(i%3 == 0 || i%5 == 0){
                num.add(i);
            }
        }

        for (int number: num) {
            sum = sum + number;
        }

        System.out.println(sum);
    }
}

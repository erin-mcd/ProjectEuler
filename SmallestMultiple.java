public class SmallestMultiple {
    public static void main(String[] args) {
        for (int i = 0; i < 1000000000; i++) {
            int answer = 0;
            if (i%20 == 0 && i%11 == 0 && i%12 == 0 && i%13 == 0 && i%14 == 0 && i%15 == 0 && i%16 == 0 && i%17 == 0 && i%19 == 0 && i%18 == 0){
            answer = i;
                System.out.println(answer);
            }
        }
    }
    }

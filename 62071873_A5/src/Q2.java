public class Q2 {
    public static void main(String[] args) {
        // Finds all of the perfect numbers between 1 and 10000 and prints them
        for (int i = 1; i <= 10000; i++) {
            int sum = 0;

            for (int n = 1; n < i; n++) {
                if (i % n == 0) {
                    sum += n;
                }
            }
            if (sum == i) {
                System.out.println(i);
            }
        }
    }
}

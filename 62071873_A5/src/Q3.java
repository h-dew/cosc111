public class Q3 {
    public static void main(String[] args){
        // Finds all of the numbers between 100 and 200 that are divisible by 5 or 6, but not both and prints them
        int count = 0;

        for(int i = 100; i <= 200; i++){
            if(i % 5 == 0 ^ i % 6 == 0){
                if(count % 10 == 0 && count != 0){
                    System.out.println();
                }
                count++;
                System.out.print(i + " ");
            }
        }
    }
}

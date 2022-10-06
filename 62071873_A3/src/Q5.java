public class Q5 {
    // Generates a random license plate
    public static void main(String[] args) throws Exception {
        // Create license plate array to store values
        char[] licensePlate = new char[7];

        for(int i = 0; i < 7; i++){
            if(i < 4){
                licensePlate[i] = generateChar();
            } else {
                licensePlate[i] = generateNum();
            }
        }
        
        System.out.println(licensePlate);
    }

    static char generateChar(){
        // Generates a random character
        char ch = (char) (Math.random() * 26 + 'A');
        return ch;
    }

    static char generateNum(){
        // Generates a random number and returns as char
        char num = (char) ((Math.random() * 10) + '0');
        return num;
    }
}

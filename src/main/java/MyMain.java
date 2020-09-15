import java.util.Scanner;

public class MyMain {
    
    public static int binaryToDecimal(String binary) { 
        int sum = 0;
        int bin = Integer.parseInt(binary);
        int mult = 1;

        if (binary.length() == 1) {
            return bin;
        }
        else {
            sum += bin % 10;
            bin /= 10;
            
            while (bin > 0) {
                mult *= 2;
                sum += mult * (bin % 10);
                bin /= 10;
            }

            return sum;
        }
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); 
        System.out.println("Please enter a decimal number: ");
        System.out.println(binaryToDecimal(scan.next()));

        scan.close();
    }
}

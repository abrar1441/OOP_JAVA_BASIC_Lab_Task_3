import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a Decimal Number : ");
        int decimal = scanner.nextInt();
        
        // Convert base 10 to base 2
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("Binary number is: " + binary);
        scanner.close();
    }
}


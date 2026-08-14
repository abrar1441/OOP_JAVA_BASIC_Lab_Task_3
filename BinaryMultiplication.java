import java.util.Scanner;

public class BinaryMultiplication {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input the first binary number: ");
        String bin1 = scanner.next();
        
        System.out.print("Input the second binary number: ");
        String bin2 = scanner.next();
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        // Multiply them together
        int product = num1 * num2;
        
        System.out.println("Product of two binary numbers: " + Integer.toBinaryString(product));
        scanner.close();
    }
}

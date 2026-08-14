import java.util.Scanner;

public class BinaryAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input first binary number: ");
        String bin1 = scanner.next();
        
        System.out.print("Input second binary number: ");
        String bin2 = scanner.next();
        
        int num1 = Integer.parseInt(bin1, 2);
        int num2 = Integer.parseInt(bin2, 2);
        
        int sum = num1 + num2;
        
        System.out.println("Sum of two binary numbers: " + Integer.toBinaryString(sum));
        scanner.close();
    }
}

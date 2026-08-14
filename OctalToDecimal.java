import java.util.Scanner;

public class OctalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input any octal number: ");
        String octal = scanner.next();
        
        // Parse the octal string into a base 10 integer (base 8)
        int decimal = Integer.parseInt(octal, 8);
        
        System.out.println("Equivalent decimal number: " + decimal);
        scanner.close();
    }
}

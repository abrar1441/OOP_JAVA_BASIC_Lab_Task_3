import java.util.Scanner;

public class OctalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input any octal number: ");
        String octal = scanner.next();
        
        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("Equivalent binary number: " + binary);
        scanner.close();
    }
}

import java.util.Scanner;

public class HexadecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Hexadecimal Number : ");
        String hex = scanner.next();
        
        // Hexadecimal string -> Decimal integer -> Binary string
        int decimal = Integer.parseInt(hex, 16);
        String binary = Integer.toBinaryString(decimal);
        
        System.out.println("Equivalent Binary Number is: " + binary);
        scanner.close();
    }
}


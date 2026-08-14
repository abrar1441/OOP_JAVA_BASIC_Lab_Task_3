import java.util.Scanner;

public class BinaryToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a Binary Number: ");
        String binary = scanner.next();
        
        // Binary string -> Decimal integer -> Hexadecimal string
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal).toUpperCase();
        
        System.out.println("HexaDecimal value: " + hex);
        scanner.close();
    }
}

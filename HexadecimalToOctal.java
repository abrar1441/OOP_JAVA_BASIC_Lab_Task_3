import java.util.Scanner;

public class HexadecimalToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a hexadecimal number: ");
        String hex = scanner.next();
        
        // Hexadecimal string -> Decimal integer -> Octal string
        int decimal = Integer.parseInt(hex, 16);
        String octal = Integer.toOctalString(decimal);
        
        System.out.println("Equivalent of octal number is: " + octal);
        scanner.close();
    }
}

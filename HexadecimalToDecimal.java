import java.util.Scanner;

public class HexadecimalToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a hexadecimal number: ");
        String hex = scanner.next();
        
        // Parse the hexadecimal string into a base 10 integer (base 16)
        int decimal = Integer.parseInt(hex, 16);
        
        System.out.println("Equivalent decimal number is: " + decimal);
        scanner.close();
    }
}

import java.util.Scanner;

public class OctalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a octal number : ");
        String octal = scanner.next();
        
        // Octal string -> Decimal integer -> Hexadecimal string
        int decimal = Integer.parseInt(octal, 8);
        String hex = Integer.toHexString(decimal).toUpperCase();
        
        System.out.println("Equivalent hexadecimal number: " + hex);
        scanner.close();
    }
}

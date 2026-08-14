import java.util.Scanner;

public class BinaryToOctal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a Binary Number: ");
        String binary = scanner.next();
        
        // Binary string -> Decimal integer -> Octal string
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        
        System.out.println("Octal number: " + octal);
        scanner.close();
    }
}

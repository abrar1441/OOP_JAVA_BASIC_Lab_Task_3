import java.util.Scanner;

public class DecimalToHexadecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input a decimal number: ");
        int decimal = scanner.nextInt();
        
        String hex = Integer.toHexString(decimal).toUpperCase();
        
        System.out.println("Hexadecimal number is : " + hex);
        scanner.close();
    }
}

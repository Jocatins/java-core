import java.util.Scanner;

public class ScannerUse {
    public static void main(String[] args) {
        int x = 0;
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        System.out.println(x);
    }
}

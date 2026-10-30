import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        double F = number * 9/5.0 + 32;
        System.out.println( String.format("%.1f",F));
    }
}

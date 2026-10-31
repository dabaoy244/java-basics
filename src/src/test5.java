import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        while (!scanner.hasNextInt()) {
            // scanner.nextInt();  ← 输入不是整数时会抛 InputMismatchException
            scanner.next();
            System.out.println("输入有误，第一个数不是整数，请重新输入：");
        }
        int a = scanner.nextInt();

        System.out.println("请输入第二个整数：");
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("输入有误，第二个数不是整数，请重新输入：");
        }
        int b = scanner.nextInt();
        System.out.println("请输入运算符(+ - * /):");
        char op = scanner.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("除数不能为零");
                }
                break;
            default:
                System.out.println("输入的运算符有误");
        }
        scanner.close(); // 关闭Scanner对象
    }
}

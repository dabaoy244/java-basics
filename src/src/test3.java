import java.util.Scanner;
public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入年份");
        if(scanner.hasNextInt()) {
            int year = scanner.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                System.out.println(year + " 是闰年");
            } else {
                System.out.println(year + " 不是闰年");
            }
        } else {
            System.out.println("输入有误");
        }
    }
}

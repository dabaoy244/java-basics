import java.math.BigDecimal;
import java.util.Scanner;

public class test4 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number[] = new int[3];
        System.out.println("请输入三个整数：");
        for (int i = 0; i < 3; i++) {
            while (!scanner.hasNextInt()) {
                scanner.next();
                System.out.println("输入有误，请重新输入第 " + (i + 1) + " 个整数：");
            }
            number[i] = scanner.nextInt();
        }
        int max = Math.max(number[0], Math.max(number[1], number[2]));
        System.out.println("最大值为：" + max);
        double average = (number[0] + number[1] + number[2]) / 3.0;
        System.out.println("平均值为：" + String.format("%.2f", average));
        System.out.println("平均值为：" + Math.round(average * 100.0) / 100.0);
        System.out.println("平均值为：" + BigDecimal.valueOf(average));


    }
}

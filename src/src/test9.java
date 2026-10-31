import java.util.Scanner;
public class test9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入年份");

        while(!sc.hasNextInt()) {
            System.out.println("输入的不是年份,请重新输入");
            sc.next();
        }
        int year = sc.nextInt();
        System.out.println("输入月份");
        while(!sc.hasNextInt()) {
            System.out.println("输入的不是月份,请重新输入");
            sc.next();
        }
        int month = sc.nextInt();
        System.out.println("输入日期");
        while(!sc.hasNextInt()) {
            System.out.println("输入的不是日期,请重新输入");
            sc.next();
        }
        int days = sc.nextInt();
        int realdays = 0;
        switch (month) {

            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                realdays = 31;

                break;
            case 4: case 6: case 9: case 11:
                realdays = 30;

                break;
            case 2:
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                realdays = isLeapYear ? 29 : 28;

                break;


        }

        while (days != realdays || days < 1) {
            System.out.println("输入的日期不合法");
            days = sc.nextInt();
        }

            System.out.println(year + "年" + month + "月" + days + "日");

        }

    }


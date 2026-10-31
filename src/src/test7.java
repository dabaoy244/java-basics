import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            scanner.next();
            System.out.println("输入的不是整数");
        }
            int c = scanner.nextInt();
        double price;
            if(c<=3) {
                price = 13;
            }else if(c>3&&c<=15) {
            price = 13+(c-3)*2.3;
        }else {
            price = 13 + 12 * 2.3 + (c - 15) * (2.3 * 1.5);
            }
        System.out.println("价格为：" + price);
            }
        }

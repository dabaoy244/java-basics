import java.util.Scanner;

public class test8 {
    static  void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三位整数");
        while(!sc.hasNextInt()){
            System.out.println("输入的不是整数");
            sc.next();
        }
        int a = sc.nextInt();
        while(a<100||a>999){
            System.out.println("输入的不是三位整数");
            a = sc.nextInt();}
        int b = (a %10 * 100) + (a /10 % 10 * 10) + (a / 100);
        System.out.println("反转后的三位整数为"+b);
    }
}

import java.util.Scanner;

public class test6 {
    static void main(String[] args) {
        Scanner sc =   new Scanner(System.in);
        String s = sc.next();
        while (s.length() != 1) {
            System.out.println("输入的字符长度不为1");
            System.out.println("请只输入一个字符");
            s = sc.next();
        }
        char c = s.charAt(0);
        if (s.length() == 1) {
            if(c >= 'A'&&c <= 'Z'){
                System.out.println("输入的是大写字母");
            }else if(c >= 'a'&&c <= 'z'){
                System.out.println("输入的是小写字母");
            }else if(c >= '0'&&c <= '9'){
                System.out.println("输入的是数字");
            }else{
                System.out.println("输入的是其他字符");

            }

        }

    }
}

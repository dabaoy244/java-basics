import java.util.Scanner;
public class test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if(scanner.hasNextInt()){
            int number = scanner.nextInt();
            if(number > 0&&number % 2 == 0){
                System.out.println("正偶数");
            }else if(number >0&&number % 2 != 0){
                System.out.println("正奇数");
            }else if(number < 0&&number % 2 == 0){

                System.out.println("负偶数");
            }else if(number <0&&number % 2 != 0){
                System.out.println("负奇数");
            }else if (number == 0)
                System.out.println("零");
            else {
                System.out.println("输入有误");
            }
        }else if (!scanner.hasNextInt())
            System.out.println("输入有误");
    }
}

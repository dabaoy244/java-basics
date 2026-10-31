import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入三个整数：");
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            while (!scanner.hasNextInt()) {
                String bad = scanner.next();
                System.out.println("“" + bad + "” 不是整数，请重新输入第 " + (i + 1) + " 个整数：");
            }
            nums[i] = scanner.nextInt();
        }
        int max = Math.max(nums[0], Math.max(nums[1], nums[2]));
        System.out.println("最大值为：" + max);
        }

    }

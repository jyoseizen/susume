import java.util.*;

public class March20{
    public static void main(String[] args){
        
        int status=1;
        int max = 0;
        int min = 0;
        while (status != 0) {
            System.out.println("请在输入第一个幸运数字吧");
            Scanner sc = new Scanner(System.in);
            int num1 = sc.nextInt();
            System.out.println("请在输入第二个幸运数字吧");
            int num2 = sc.nextInt();
            if (num1 > num2) {
                max = num1;
                min = num2;
                status = 0;
            }
            else if (num1 < num2) {
                max = num2;
                min = num1;
                status = 0;
            }
            else System.out.println("不能输入相同的数字哦!请你重新输入吧");
        }
       
        int lgth = max - min + 1;
        int [] arr = new int[lgth];
        int oddNum = 0;//奇数
        int evenNum = 0;//偶数
        for(int i = 0;i < lgth;i++){
            arr[i] = min;
            min++;
            if (arr[i] % 2 == 1) {
                oddNum++;
            }
            else evenNum++;
        }
        System.out.println("奇数个数是"+oddNum+"!");
        System.out.println("偶数个数是"+evenNum+"!");
    }
}
import java.util.*;

public class Text{
    public static void main(String[] args){
        System.out.println("请输入一个你心仪的数字"\n"这个数字要在0~100之间");
        Scanner sc = new Scanner(System.in);
        int targetnumber = sc.nextInt();//目标数字
	
	Random r = new Random();
	int guessnumber = r.nextInt(101);
	while(guessnumber != targetnumber){
		int temp = guessnumber;
		if (guessnumber > targetnumber){
			System.out.println("看来"+guessnumber+”这个数字过大了，我再猜猜“);
			guessnumber = r.nextInt(guessnumber);
			}
		else (guessnumber < targetnumber){
			System.out.println("看来"+guessnumber+”这个数字过大了，我再猜猜“);
			guessnumber = r.nextInt(guessnumber);
			}
        }
	System.out.println(guessnumber+"这就是你想要的数字吧");
    }
}
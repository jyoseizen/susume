import java.util.*;

public class March19{
    public static void main(String[] args){
        System.out.println("请在下面输入一个你的幸运数字");
        Scanner sc = new Scanner(System.in);
        int targetNumber = sc.nextInt();
        int numDigits = String.valueOf(targetNumber).length();
	    Random r = new Random();
        int min = 0;
        int max = (int) Math.pow(10, numDigits);
        int guessNumber = r.nextInt(max - min ) + min;
        int guesses = 1;
	    while(guessNumber != targetNumber){
		    if (guessNumber > targetNumber){
			    System.out.println("看来"+guessNumber+"这个数字过大了，我再猜猜");     
                max = guessNumber;
			    }
		    else if(guessNumber < targetNumber){
			    System.out.println("看来"+guessNumber+"这个数字过小了，我再猜猜");
                min = guessNumber;
			    }
            guessNumber = r.nextInt(max - min ) + min;
            guesses++;
         }

	    System.out.println(guessNumber+"这就是你想要的数字吧");
        System.out.println("猜测次数为：" + guesses);
    }
}


import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int sum=0;
        int numInputs=0;
        int even=0;
        int odd=0;
        while(true){
            System.out.println("Give numbers:\"");
            i = Integer.valueOf(scanner.nextLine());
            if(i==-1){
                break;
            }
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
            numInputs++;
            sum+=i;
        }
        System.out.println("Thx! Bye!");
        if(numInputs!=0){                    
            System.out.println("Sum: "+sum);
            System.out.println("Numbers: "+numInputs);
            System.out.println("Average: "+(sum*1.0/numInputs));
            System.out.println("Even: "+even);
            System.out.println("Odd: "+odd);
        }
    }
}

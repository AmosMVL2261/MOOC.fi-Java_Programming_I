
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int a;
        while(true){
            System.out.println("Give a number:");
            a = Integer.valueOf(scanner.nextLine());
            if(a==0){
                break;
            }
            sum+=a;
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}

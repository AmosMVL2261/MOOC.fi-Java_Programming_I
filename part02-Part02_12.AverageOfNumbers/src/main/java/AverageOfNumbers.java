
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int i = 0;
        int a;
        while(true){
            System.out.println("Give a number:");
            a = Integer.valueOf(scanner.nextLine());
            if(a==0){
                break;
            }
            i++;
            sum+=a;
        }
        System.out.println("Average of the numbers: "+(sum*1.0/i));
    }
}

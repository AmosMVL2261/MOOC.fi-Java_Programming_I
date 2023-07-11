
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        while(true){
            System.out.println("Give a number");
            a = Integer.valueOf(scanner.nextLine());
            if(a<0){
                System.out.println("Unsuitable number");
                continue;
            }else if(a==0){
                break;
            }else {
                System.out.println(a*a);
            }
        }
    }
}

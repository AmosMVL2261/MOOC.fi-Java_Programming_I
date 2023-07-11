
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number:");
        int n = Integer.valueOf(scanner.nextLine());
        int fac=1;
        if(n==0 || n==1){
            System.out.println("Factorial: 1");
        }else{
            for(int i=2;i<=n;i++){
                fac*=i;
            }
            System.out.println("Factorial: "+fac);
        }
        
    }
}

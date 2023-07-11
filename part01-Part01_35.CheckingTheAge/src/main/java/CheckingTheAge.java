
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int n = Integer.valueOf(scan.nextLine());
        if(n>=0 && n<121){
            System.out.println("OK!");
        }else {
            System.out.println("Impossible!");
        }
    }
}

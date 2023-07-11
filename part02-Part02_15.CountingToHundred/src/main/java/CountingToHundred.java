
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inp = Integer.parseInt(scanner.nextLine());
        for(int i = inp ;i<=100;i++){
            System.out.println(i);
        }
    }
}

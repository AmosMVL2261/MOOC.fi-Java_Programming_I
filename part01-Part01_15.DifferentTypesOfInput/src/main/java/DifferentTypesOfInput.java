
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a string:");
        String msg1 = scan.nextLine();
        System.out.println("Give an integer:");
        int msg2 = Integer.valueOf(scan.nextLine());
        System.out.println("Give a double:");
        double msg3 = Double.valueOf(scan.nextLine());
        System.out.println("Give a boolean:");
        boolean msg4 = Boolean.valueOf(scan.nextLine());
        System.out.println("You gave the string "+msg1);
        System.out.println("You gave the integer "+msg2);
        System.out.println("You gave the double "+msg3);
        System.out.println("You gave the boolean "+msg4);
    }
}

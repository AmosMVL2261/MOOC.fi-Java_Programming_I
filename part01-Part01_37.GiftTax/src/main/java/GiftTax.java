
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int sum = Integer.valueOf(scan.nextLine());
        double taxes = 0;

        if (sum < 5000) {
            System.out.println("No tax!");
        }
        if (sum >= 5000 && sum < 25000) {
            taxes = 100 + (sum - 5000) * 0.08;
            System.out.println("Tax: " + taxes);
        }
        if (sum >= 25000 && sum < 55000) {
            taxes = 1700 + (sum - 25000) * 0.1;
            System.out.println("Tax: " + taxes);

        }
        if (sum >= 55000 && sum < 200000) {
            taxes = 4700 + (sum - 55000) * 0.12;
            System.out.println("Tax: " + taxes);

        }
        if (sum >= 200000 && sum < 1000000) {
            taxes = 22100 + (sum - 200000) * 0.15;
            System.out.println("Tax: " + taxes);
        }
        if (sum >= 1000000) {
            taxes = 142100 + (sum - 1000000) * 0.17;
            System.out.println("Tax: " + taxes);
        }
    }
}

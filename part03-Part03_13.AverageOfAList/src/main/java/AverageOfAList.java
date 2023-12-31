
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            int i = Integer.valueOf(scanner.nextLine());
            if(i==-1){
                break;
            }
            list.add(i);
        }

        System.out.println("");

        int sum=0;
        for (int element : list) {
            sum+=element;
        }
        System.out.println("Average: "+(sum*1.0/list.size()));
    }
}

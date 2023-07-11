
import java.util.Scanner;

public class LiquidContainers2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Container container1 = new Container();
        Container container2 = new Container();

        while (true) {
            System.out.println("First: "+container1);
            System.out.println("Second: "+container2);
            
            String input = scan.nextLine();
            String[] inputList = input.split(" ");
            String option = inputList[0];
            if (option.equals("quit")) {
                break;
            }
            if (option.equals("add")) {
                int liquid = Integer.valueOf(inputList[1]);
                container1.add(liquid);
                
            }
            if (option.equals("move")) {
                int liquid = Integer.valueOf(inputList[1]);
                if (liquid <= 0) {
                    return;
                }
                if (container1.contains()>0){
                    if(container1.contains()-liquid<0){
                        container2.add(container1.contains());
                        container1.remove(liquid);
                    }else{
                        container1.remove(liquid);
                        container2.add(liquid);
                    }
                }
                
            }
            if (option.equals("remove")) {
                int liquid = Integer.valueOf(inputList[1]);
                container2.remove(liquid);
                
            }

        }
    }

}

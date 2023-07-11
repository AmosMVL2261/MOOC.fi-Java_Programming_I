
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int container1=0;
        int container2=0;

        while (true) {
            //System.out.print("> ");
            System.out.println("First: "+container1+"/100");
            System.out.println("Second: "+container2+"/100");
            
            String input = scan.nextLine();
            
            String[] inputList = input.split(" ");
            String option = inputList[0];
            if (option.equals("quit")) {
                break;
            }
            if (option.equals("add")) {
                int liquid = Integer.valueOf(inputList[1]);
                if (liquid <= 0) {
                    return;
                }
                if (container1 + liquid <= 100) {
                    container1 += liquid;
                } else {
                    container1 = 100;
                }
                
            }
            if (option.equals("move")) {
                int liquid = Integer.valueOf(inputList[1]);
                if (liquid <= 0) {
                    return;
                }
                if (container1>0){
                    if(container1-liquid<0){
                        if (container2 + container1 <= 100) {
                            container2 += container1;
                        } else {
                            container2 = 100;
                        }
                        container1=0;
                    }else{
                        container1-=liquid;
                        if (container2 + liquid <= 100) {
                            container2 += liquid;
                        } else  {
                            container2 = 100;
                        }
                    }
                }
                
            }
            if (option.equals("remove")) {
                int liquid = Integer.valueOf(inputList[1]);
                if (liquid <= 0) {
                    return;
                }
                if (container2 - liquid < 0) {
                    container2 = 0;
                } else if (container2 - liquid >= 0) {
                    container2 -= liquid;
                }
                
            }

        }
    }

}


import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age=0;
        String old="";
        while(true){
            String s = scanner.nextLine();
            if(s.length()==0){
                break;
            }
            String[] data = s.split(",");
            if(age<Integer.valueOf(data[1])){
                age=Integer.valueOf(data[1]);
                old =data[0];
            }
        }
        System.out.println("Age of the oldest: "+age);
    }
}

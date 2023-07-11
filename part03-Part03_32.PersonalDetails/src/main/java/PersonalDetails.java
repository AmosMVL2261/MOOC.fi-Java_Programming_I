
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int count=0;
        String name="";
        while(true){
            String s = scanner.nextLine();
            if(s.length()==0){
                break;
            }
            String[] data = s.split(",");
            if(name.length()<data[0].length()){
                name=data[0];
            }
            sum+=Integer.valueOf(data[1]);
            count++;
        }
        System.out.println("Longest name: "+name);
        System.out.println("Average of the birth years: "+(sum *1.0 / count));
    }
}

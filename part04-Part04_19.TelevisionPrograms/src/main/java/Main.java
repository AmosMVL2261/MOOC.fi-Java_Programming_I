import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Name:");
            String name = scanner.nextLine();
            if(name.length()==0){
                break;
            }
            System.out.println("Duration:");
            int duration = Integer.valueOf(scanner.nextLine());
            TelevisionProgram t = new TelevisionProgram(name, duration);
            programs.add(t);
        }
        System.out.println("Program's maximum duration?");
        int duration = Integer.valueOf(scanner.nextLine());
        for (int i = 0; i < programs.size(); i++) {
            if(programs.get(i).getDuration()<=duration){
                System.out.println(programs.get(i));
            }
        }
    }
}

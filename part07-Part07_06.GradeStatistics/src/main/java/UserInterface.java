import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private Grades grades;

    public UserInterface(Scanner scanner){
        this.scanner=scanner;
        this.grades = new Grades();
    }

    public void start(){
        while(true){
            System.out.println("Enter point totals, -1 stops:");
            int grade = Integer.valueOf(scanner.nextLine());
            if(grade==-1){
                break;
            }
            grades.add(grade);
        }
        System.out.println("Point average (all): "+grades.getAverageAll());
        double approved = grades.getAverageApproved();
        if(approved!=-1){
            System.out.println("Point average (passing): "+approved);
        }else{
            System.out.println("Point average (passing): -");
        }
        System.out.println("Pass percentage: "+grades.getPassPercentage());
        grades.gradeDistribution();
    }


}

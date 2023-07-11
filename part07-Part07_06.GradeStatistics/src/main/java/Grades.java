import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> grades;
    private int aprovedCount;

    public Grades(){
        this.grades = new ArrayList<>();
    }

    public void add(int grade){
        if(grade>=0 && grade <=100){
            grades.add(grade);
        }
    }

    public double getAverageAll(){
        double sum = 0;
        for (int grade : grades) {
            sum+=grade;
        }
        return sum / grades.size(); 
    }

    public double getAverageApproved(){
        double sum = 0;
        double count = 0;
        for (int grade : grades) {
            if(grade>=50){
                sum+=grade;
                count++;
            }
        }
        if(count==0){
            return -1;
        }else{
            return sum / count; 
        }
    }

    public double getCountApproved(){
        int count = 0;
        for (int grade : grades) {
            if(grade>=50){
                count++;
            }
        }
        return count;
    }

    public double getPassPercentage(){
        return 100 * getCountApproved() / grades.size();
    }

    public void gradeDistribution(){
        int failed = 0;
        int fifty = 0;
        int sixty = 0;
        int seventy = 0;
        int eighty = 0;
        int ninety = 0;
        for (int grade : this.grades) {
            if(grade<50){
                failed++;
            }
            if(grade>=50 && grade<60){
                fifty++;
            }
            if(grade>=60 && grade<70){
                sixty++;
            }
            if(grade>=70 && grade<80){
                seventy++;
            }
            if(grade>=80 && grade<90){
                eighty++;
            }
            if(grade>=90 && grade<=100){
                ninety++;
            }
        }

        System.out.println("5:"+getStars(ninety));
        System.out.println("4:"+getStars(eighty));
        System.out.println("3:"+getStars(seventy));
        System.out.println("2:"+getStars(sixty));
        System.out.println("1:"+getStars(fifty));
        System.out.println("0:"+getStars(failed));
    }

    public String getStars(int number){
        String stars = "";
        for (int i = 1; i <= number; i++) {
            stars+="*";
        }
        return stars;
    }

}

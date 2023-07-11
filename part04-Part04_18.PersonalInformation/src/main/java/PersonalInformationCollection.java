
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("First name:");
            String first = scanner.nextLine();
            if(first.length()==0){
                break;
            }
            System.out.println("Last name:");
            String last = scanner.nextLine();
            System.out.println("Identification number:");
            String id = scanner.nextLine();
            PersonalInformation p = new PersonalInformation(first, last, id);
            infoCollection.add(p);
        }
        for(int i=0;i<infoCollection.size();i++){
            System.out.println(infoCollection.get(i).getFirstName() + " " + infoCollection.get(i).getLastName());
        }
    }
}

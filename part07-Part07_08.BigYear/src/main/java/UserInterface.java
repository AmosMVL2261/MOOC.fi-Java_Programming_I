import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private BirdCollection collection;

    public UserInterface(Scanner scanner){
        this.scanner=scanner;
        this.collection = new BirdCollection();
    }

    public void start(){
        while(true){
            System.out.println("?");
            String option = scanner.nextLine();
            if(option.equals("Add")){
                System.out.println("Name:");
                String name = scanner.nextLine();
                System.out.println("Name in Latin:");
                String latinName = scanner.nextLine();
                this.collection.addBird(name, latinName);
            }
            if(option.equals("Observation")){
                System.out.println("Bird?");
                String name = scanner.nextLine();
                this.collection.addObservation(name);
            }
            if(option.equals("All")){
                this.collection.printAll();
            }
            if(option.equals("One")){
                System.out.println("Bird?");
                String name = scanner.nextLine();
                this.collection.printOne(name);
            }
            if(option.equals("Quit")){
                break;
            }
        }
    }

}

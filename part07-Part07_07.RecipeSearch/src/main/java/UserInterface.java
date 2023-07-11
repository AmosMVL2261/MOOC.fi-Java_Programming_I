import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private Scanner scanner;
    private ArrayList<String> recipesList;

    public UserInterface(Scanner scanner){
        this.scanner = scanner;
        this.recipesList = new ArrayList();
    }

    public void start(){
        System.out.println("File to read:");
        String file = scanner.nextLine();
        try(Scanner fileOpen = new Scanner(Paths.get(file))){
            //Scan the file             
            while(fileOpen.hasNextLine()){
                String line = fileOpen.nextLine();
                recipesList.add(line);
            }
            //Create the recipes
            Recipes recipes = new Recipes(recipesList);
            //Menu
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");
            System.out.println("stop - stops the program");
            while(true){
                System.out.println("");
                System.out.println("Enter command:");
                System.out.println("");
                String option = scanner.nextLine();
                if(option.equals("list")){
                    recipes.printAll();
                }
                if(option.equals("find name")){
                    System.out.println("\nSearched word:");
                    String name = scanner.nextLine();
                    recipes.searchName(name);
                }
                if(option.equals("find cooking time")){
                    System.out.println("\nMax cooking time:");
                    int time = Integer.valueOf(scanner.nextLine());
                    recipes.searchTime(time);
                }
                if(option.equals("find ingredient")){
                    System.out.println("\nSearched word:");
                    String ingredient = scanner.nextLine();
                    recipes.searchIngredient(ingredient);
                }
                if(option.equals("stop")){
                    break;
                }
            }
            
            

        } catch (Exception e) {
            System.out.println("Error: "+e.getMessage());
        }
    }
}

import java.util.Scanner;

public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;

    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.dictionary=dictionary;
        this.scanner=scanner;
    }

    public void start(){
        while(true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if(command.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            if(command.equals("add")){
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                this.dictionary.add(word, translation);
            }
            if(command.equals("search")){
                System.out.println("To be translated:");
                String word = scanner.nextLine();
                String translation = dictionary.search(word);
                if(translation==null){
                    System.out.println("Word "+word+" was not found");
                }else{
                    System.out.println("Translation:"+translation);
                }
            }else{
                System.out.println("Unknown command");
            }

        }
    }
}

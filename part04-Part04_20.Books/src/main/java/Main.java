import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            //System.out.println("Title:");
            String title = scanner.nextLine();
            if(title.length()==0){
                break;
            }
            //System.out.println("Pages:");
            int pages = Integer.valueOf(scanner.nextLine());
            //System.out.println("Publication year:");
            int year = Integer.valueOf(scanner.nextLine());
            Book b = new Book(title, pages, year);
            books.add(b);
        }
        //System.out.println("What information will be printed?");
        String option = scanner.nextLine();
        if(option.equals("everything")){
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i));    
            }
        }else if(option.equals("name")){
            for (int i = 0; i < books.size(); i++) {
                System.out.println(books.get(i).getTitle());    
            }
        }
    }
}

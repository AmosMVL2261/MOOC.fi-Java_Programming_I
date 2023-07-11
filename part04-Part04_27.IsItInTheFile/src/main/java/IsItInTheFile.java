
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        int flag = 0;
        try(Scanner openFile = new Scanner(Paths.get(file))){
            while(openFile.hasNextLine()){
                String s = openFile.nextLine();
                if(s.equals(searchedFor)){
                    flag=1;
                }
            }
        }catch(Exception e){
            System.out.println("Reading the file "+file+" failed.");
            return;
        }
        if(flag==1){
            System.out.println("Found!");
        }else{
            System.out.println("Not found.");
        }
    }
}

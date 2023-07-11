
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        try(Scanner openFile = new Scanner(Paths.get(file))) {
            while(openFile.hasNextLine()){
                String s = openFile.nextLine();
                String[] data = s.split(",");
                if(data[1].equals("1")){
                    System.out.println(data[0]+", "+data[1]+" year");
                }else{
                    System.out.println(data[0]+", "+data[1]+" years");
                }
                
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

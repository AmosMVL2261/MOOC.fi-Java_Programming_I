
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true){
            String s = scanner.nextLine();
            if(s.length()==0){
                break;
            }
            String[] words = s.split(" ");
            System.out.println(words[words.length-1]);
        }
    }
}

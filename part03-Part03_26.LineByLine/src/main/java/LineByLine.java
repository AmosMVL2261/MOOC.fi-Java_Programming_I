
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            String s = scanner.nextLine();
            if(s.length()==0){
                break;
            }
            String[] words = s.split(" ");
            for(int i=0;i<words.length;i++){
                System.out.println(words[i]);
            }
        }

    }
}

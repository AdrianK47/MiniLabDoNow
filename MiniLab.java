import java.util.*;
public class MiniLab{
    public static void main(String[] args){
        ArrayList<String> favorites = new ArrayList<String>();
        Scanner scan = new Scanner(System.in);
        String userInput;

        for(int i = 0; i < 6; i++){
            System.out.print("What is your favorite food? ");
            userInput = scan.next();
            favorites.add(userInput);
        }
        for(int x = 0; x < 6; x++){
            System.out.println(favorites.get(x));
        }
    }
}
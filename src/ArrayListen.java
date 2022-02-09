import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListen {

    public static void main(String[] args) {

        String streng = "";
        ArrayList<String> listen = new ArrayList<String>();
        boolean answer = false;


        System.out.print("Enter a word: ");
        Scanner input = new Scanner(System.in);
        streng = input.next();

        listen.add("Hej");
        listen.add("Hvordan");
        listen.add("Du");
        listen.add("Måske");
        listen.add("Hajtand");

        answer = doesArraylistContainString(streng, listen);

        if(answer == true){
            System.out.println("The String has been found");
        }else if(answer == false){
            System.out.println("Your word has been added to the list");
        }

        for(int i = 0; i < listen.size(); i++){
            System.out.println((i+1) + ". " + listen.get(i));
        }

    }

    public static boolean doesArraylistContainString(String streng, ArrayList listen){

        boolean trueFalse = false;

        for(int i = 0; i < listen.size(); i++){
            if(listen.get(i).equals(streng)){
                trueFalse = true;
                break;

            }else{
                trueFalse = false;

            }

        }

        if(trueFalse == false){
            listen.add(streng);
        }

        return trueFalse;
    }


}

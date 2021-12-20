import java.util.Random;
import java.util.Scanner;
public class Magic8 {

    public static void main (String[] args) {
        //creating a new scanner object
        Scanner scan = new Scanner(System.in);


        //tell the user to ask a question
        System.out.println("Ask a yes or no question.");

        //read the user input
        //String question = scan.next();
        //System.out.println(question);


        Random rand = new Random();
        int upperbound = 7;
        int int_random = rand.nextInt(upperbound);

        if (int_random == 0) {
            System.out.println("NO!");
        } else if (int_random == 1) {
            System.out.println("YES!");
        } else if (int_random == 2) {
            System.out.println("Not now. Later.");
        } else if (int_random == 3) {
            System.out.println("Low chances.");
        } else if (int_random == 4) {
            System.out.println("There is a possibility.");
        } else if (int_random == 5) {
            System.out.println("Maybe not yet.");
        } else{
            System.out.println("Maybe.");
        }

    }
}
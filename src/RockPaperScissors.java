import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {


    public static void main(String[] args) {
        String input;
        int number;


        //Player moves
        Scanner keyboard = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Rock, Paper, Scissors? ");
        input = keyboard.nextLine();

        //Computer moves
        number = rand.nextInt(3);


        if(number == 0)
        {
            System.out.println("Rock");
        }

        else if (number == 1)
        {
            System.out.println("Paper");
        }
        else if (number == 2)
        {
            System.out.println("Scissors");
        }

        // compare moves

        if (input.equals("rock") && number == 2 || number == 0 && input.equals("scissors"))
        {

            rockWins();

        }
        else if (input.equals("paper") && number == 0 || number == 1 && input.equals("rock"))
        {

            paperWins();
        }
        else if (input.equals("scissors") && number == 1 || number == 2 && input.equals("paper"))
        {

            scissorsWins();
        }
        else
            System.out.println("It's a drawl");


    }





    public static void rockWins() {

        System.out.println("Rock smashes Scissors");
    }

    public static void paperWins() {
        System.out.println("Paper covers rock");
    }

    public static void scissorsWins() {
        System.out.println("Scissors cuts paper");
    }
}


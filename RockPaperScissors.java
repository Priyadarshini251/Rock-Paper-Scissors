import java.util.Scanner;   //for getting input from user
import java.util.Random;  //used to benerate the random number for the computers choice

public class RockPaperScissors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();   //generate a random no.

        boolean playAgain=true;

        while(playAgain)
        {
            System.out.println("\nRock, Paper, Scissors Game!");
            System.out.println("1.Rock");
            System.out.println("2.Paper");
            System.out.println("3.scissors");
            System.out.println("Enter your choice(1-3):");
             
      
        int userChoice = sc.nextInt();
        int computerChoice = rand.nextInt(3)+1; //rand.nextInt(3) generate 0,1,2.//adding +1 gives 1,2,or 3 (same as user input)

        System.out.println("You choose:" + getChoiceName(userChoice));
        System.out.println("Computer choose:" + getChoiceName(computerChoice));
        //in above calls the getChoiceName() method to convert the number into word.1->Rock

        switch(userChoice)
        {
            case 1:
             switch(computerChoice)
             {
                case 1:System.out.println("Its a tie!");
                break;
                case 2:System.out.println("You lost! Paper covers Rock.");
                break;
                case 3:System.out.println("You won! Rock crushes the scissors.");
                break;
             }
             break;
             case 2:
             switch(computerChoice)
             {
              case 1:System.out.println("You won! Paper covers Rock.");
                break;  
                case 2:System.out.println("Its a tie!");
                break;
                case 3:System.out.println("You lost! Scissors cut paper.");
                break;
             }
             break;
             case 3:
             switch(computerChoice)
             {
                case 1:System.out.println("You lost! Rock crushes the scissors.");
                break;
                 case 2:System.out.println("You won! Scissors cut paper.");
                break;
                 case 3:System.out.println("Its a tie!");
                break;
             }
             break;
             default:
              System.out.println("Invalid input! Please enter 1, 2, or 3.");
              //if user inputs anything other than 1,2,3.
        }
        //ask if the user wants to play again
        System.out.println("Do you want to play again!! (yes/no):");
        sc.nextLine(); //clear the new line left by nextInt()
        String answer = sc.nextLine();

        if(!answer.equalsIgnoreCase("yes"))
        {
            playAgain = false;
            System.out.println("Thanks for playing! Goodbye.");
        }
    }
        sc.close();
    }
    public static String getChoiceName(int choice)
    {
        switch(choice)
        {
            case 1:return"Rock";
            case 2:return"Paper";
            case 3:return"Scissors";
            default:return"Invalid";
        }
    }
}
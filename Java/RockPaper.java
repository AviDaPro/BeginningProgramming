import java.util.Random;
import java.util.Scanner;

public class RockPaper {
  
  public static String rps(int num) 
  {
    String Output = "null";
    if (num == 0) {
      Output = "rock";
    } else if (num == 1) {
      Output = "paper";
    } else {
      Output = "scissors";
    }
    return Output;
  }
  
  public static void play() 
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello there, my name is radion, and I am an AI to keep you company!\n");
    System.out.println(
        "first off, lets get to know eachother! What would you like me to call you? \n(Warning: don't use your real name)");

    String name = sc.next();

    System.out.println(name + ", huh? Thats a great name! I hope we can get to know eachother!\n");

    System.out.println(
        "Now, what would you like to do? Do you want to play a game, (press 1) talk (press 2), or end the conversation? (press 3)");

    int todo = sc.nextInt();
    if (todo == 3) {
      System.out.println("Ok " + name + ". It was nice talking to you, I hope you liked this program and come back soon!");
    } 
    
    if (todo == 2) {
      System.out.println("Would you like to talk about your day? \n Yes (press 1) \n No (press 2)");
      int talk = sc.nextInt();
      if (talk == 1) {
        System.out.println("how was you day," + name + "? \n Good (press 1) \n Bad (press 2) \n So-So (press 3)");
        int day = sc.nextInt();
        if (day == 1) {
          System.out.println("Thats great to know, " + name + "!");
        }
        if (day == 2) {
          System.out.println("Thats sad to know, " + name + ". Some days are better than others. Lets hope that tommorow is better than today.");  
        }
        if (day == 3) {
          System.out.println("So-So huh? well, some days are like \nthat, " + name + ".");
        }        
      }
      if (talk==2) {
        System.out.println("Ok then, please restart the program to play again, see you!"); 
      }
    }
    if (todo == 1) {
      System.out.println("Ok, we will be playing rock paper scissors! ");
      Random random = new Random();
      int botNum = random.nextInt(3) - 1;
      String botChoice = rps(botNum);

      try {
        Thread.sleep(1000);
      } catch (Exception E) {}

      String rematch = "yes";
      
      do {
        System.out.println("Now, what is your choice? Either type rock, paper or scissors ");
        String plyrChoice = sc.next();
        if (botChoice.equals("rock") && plyrChoice.equals("paper")) {
          System.out.println("Congratulations, you beat me! I got rock, and you got paper, and paper covers rock. If you want to play again, restart the program.");
        }
        if (botChoice.equals("paper") && plyrChoice.equals("rock")) {
          System.out.println("Yes, I won! I got paper, and you got rock, and paper covers rock. If you want to play again, restart the program.");
        } else if (botChoice.equals("scissors") && plyrChoice.equals("rock")) {
          System.out.println("Congratulations, you beat me! I got scissors, and you got rock, and rock crushes scissors. If you want to play again, restart the program.");
       } else if (botChoice.equals("rock") && plyrChoice.equals("scissors")) {
          System.out.println("Yes, I won! I got rock and you got scissors, and rock crushes scissors. If you want to play again, restart the program.");
        } else if (botChoice.equals("scissors") && plyrChoice.equals("paper")) {
          System.out.println("Yes, I won! I got scissors, and you got paper, and scissors cuts paper. If you want to play again, restart the program.");
        } else if (plyrChoice.equals("scissors") && botChoice.equals("paper")) {
          System.out.println("Congratulations, you beat me! I got paper, and you got scissors, and scissors cut paper. If you want to play again, restart the program.");
        }
        if (plyrChoice.equals(botChoice)) {
          System.out.println("Its a tie! we both got " + botChoice + ". If you want to play again, restart the program.");
        }
        System.out.println("Now that we finished this round, do you want to play again? (yes/no)");
        rematch = sc.next();
      } while (rematch.equals("yes"));
    }
  }

  public static void main(String[] args) 
  {
    play();
  }
}

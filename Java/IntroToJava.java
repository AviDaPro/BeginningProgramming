import java.util.Scanner;

public class IntroToJava {
 
    public static void main(String[] a)
    {   
        
    	System.out.println("Hello!");
        //MakeTurtle.make();
        Scanner sc = new Scanner(System.in);
        System.out.println("Would you like to use calculator (0) or play Rock/paper/scissors (1) or make turtle (2)? ");
        int choice = sc.nextInt();
        if (choice == 0) {
            Calculator.calculate();
        } else if (choice == 1) {
            RockPaper.play();
        } else {
            MakeTurtle.make();
        }

        sc.close();
    }
}
         



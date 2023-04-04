import java.util.Scanner;
public class IntroToJava {

   
    public static void main(String[] a)
    {   
    	System.out.println("Hello!");
        //MakeTurtle.make();
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to my calculator app! Choose what kind of opperator you want from the following bellow. 1. * 2. / 3. - 4. +  5. exponents, and finally 6. factorals");
        
        String opp = sc.next();
        if (!(opp.equals("-") || opp.equals("+") || opp.equals("/") || opp.equals("*") || opp.equals("exponents") || opp.equals("factorals"))) {
            System.out.println("You may have made a typo, or there is something wrong with the code. Please restart the program.");
        }
        System.out.println("select your first number (no decimal, and if your doing exponents, neither of the numbers can be 10 or more, or you might not get the answer you where trying to get.");
        int x = sc.nextInt();
        System.out.println("Select your second number (same rules apply as the first number)");
        int y = sc.nextInt();
        int z = x+-y;
        int w = x+y;
        double s = ((double)x)/y;
        if(opp.equals("exponents")) {
            System.out.println(x + " to the power of "+ y +" is equal to " + Math.pow(x, y));
        }

        if (opp.equals("*")) {
            System.out.println(x + " multiplied by " + y + " is equal to " + x*y);
        }

        if (opp.equals("/")) {
            System.out.println(x+ " divided by " + y + " is equal to " + s);
        }

        if (opp.equals("+")) {   
            System.out.println(x + " plus " + y + " is equal to " + w );
        }
        if (opp.equals("-")){
            System.out.println(x + " minus " + y + " is equal to " + z);
        }
        if (opp.equals("factorals")) {
            
        for(int num = x;num>0;num = num-1    ) {
            x = x * num;
        }
        System.out.println(x);
        }
        System.out.println("Thank you so much for using my calculator app, and if you want you can restart the app to try to do different equations.");
        

    }
}
         



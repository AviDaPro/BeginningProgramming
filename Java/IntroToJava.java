import java.util.Scanner;

public class IntroToJava {
 
    public static void main(String[] a)
    {   
        
    	System.out.println("Hello!");
        //MakeTurtle.make();
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to my calculator app! Choose what kind of opperator you want from the following bellow. 1. * 2. / 3. - 4. +  5. exponents,  \nand finally 6. factorials");
        
        String opp = sc.next();
        if (!(opp.equals("-") || opp.equals("+") || opp.equals("/") || opp.equals("*") || opp.equals("exponents") || opp.equals("factorials"))) {
            System.out.println("You may have made a typo, or there is something wrong with the code. Please restart the program.");
        }

        Calculator calc = new Calculator();

        if(opp.equals("exponents")) {
            System.out.println("Please enter your base number (no decimal).");
            int base = sc.nextInt();
            System.out.println("Please enter your expeonent. Try not to make it more than 10.");
            int exponent = sc.nextInt();
            int result = calc.power(base, exponent);
            System.out.println(base + " to the power of "+ exponent +" is equal to " + result);
        }

        if (opp.equals("*")) {
            System.out.println("Please enter your first multiplicand. (No decimal)");
            int multiplicand1 = sc.nextInt();
            System.out.println("Please enter your second multiplicand(no decimal)");
            int multiplicand2 = sc.nextInt();
            int product = calc.multiply(multiplicand1,multiplicand2);
            System.out.println(multiplicand1 + " multiplied by " + multiplicand2 + " is equal to " + product);
        }

        if (opp.equals("/")) {
            System.out.println("Please enter your dividend (no decimal)");
            int dividend = sc.nextInt();
            System.out.println("Please enter your divisor. (no decimal nor zero)");
            int divisor = sc.nextInt();
            double quotient = calc.divide(dividend,divisor);
            System.out.println(dividend + " divided by " + divisor + " is equal to " + quotient);
        }

        if (opp.equals("+")) {   
            System.out.println("Please enter your first addend (No decimal)");
            int addend1 = sc.nextInt();
            System.out.println("Please enter your second addend (no decimal)");
            int addend2 = sc.nextInt();
            int sum = calc.add(addend1, addend2);
            System.out.println(addend1 + " plus " + addend2 + " is equal to " + sum );
        }
        if (opp.equals("-")){
            System.out.println("Please enter your minuend (number thats getting subtracted). No decimal, please.");
            int minuend = sc.nextInt();
            System.out.println("Please enter your subtrahend (number thats subtracting). No decimal, please");
            int subtrahend = sc.nextInt();
            int difference = calc.subtract(minuend, subtrahend);
            System.out.println(minuend + " minus " + subtrahend + " is equal to " + difference);
        }
        if (opp.equals("factorials")) {
            System.out.println("Please enter the number you want the factorial of");
            int factor = sc.nextInt();
            int answer = calc.factorial(factor);
            System.out.println("the factorial of " + factor + " is " + answer);
        }
        System.out.println("Thank you so much for using my calculator app, and if you want you can restart the app to try to do different equations.");
      

        sc.close();
    }
}
         



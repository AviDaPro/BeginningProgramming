

import java.util.Scanner;
public class Loops{


    public static void main(String[] args) {
    System.out.println("Hello world!");
    /*int x = 23;
    while (x<103){
      System.out.println(x);
      x+=2;
    }
    int y = 23;
    while (y<124){
        System.out.println(y);
        y+=2;
    }
  } This is a while loop*/
  /* int x = 0
   *    while (x<103){
   *        System.out.println(x)
   * x+=2; if (x = 3{
   * break;})} This is a while loop but it ends when x =3 
   * instead of 102
   */
  /*Scanner sc = new Scanner(System.in);
  System.out.println("hello there! please choose an integer.");
int n = sc.nextInt();
System.out.println("now, please choose another number, which is greater than the previous number.");
int y = sc.nextInt();
System.out.println("Next, choose an integer to increment by. ");
int h = sc.nextInt();
System.out.println("finally, choose a number which"+
 "multiple's wont be included in the list.");
 int z = sc.nextInt(); 
while(n<y+1) {
n+=h; 
if (n%z== 0) {
    continue;
}
System.out.println(n);
}*/

/* 
int i = 3
do {
    System.out.println(i);
    i++;
} while(1<i);
this is a do while loop. 
 */
/*System.out.println("please enter a number");
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println("please enter another number");
int n = sc.nextInt();
     do {
    System.out.println(x);
    x++;
}while(x < n);*/

for (int i = 1; i<=10; i++) {
  
    System.out.println(i); 
    for (int j = 1; j<=10; j++ ) {
        int x = i*j; 
          System.out.print(x + " ");
      }
  }
// some really cool code above here. 

    }

}

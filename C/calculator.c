#include <stdio.h>
#include <math.h>

int main()
{
    printf("Hello!\n");
    int x, y, z, w, opp;
    double s, exponent;
    
        printf("welcome to my calculator app! Choose the corresponding number for each operator\n 1: addition \n 2:subtraction \n 3:multiplication \n 4:division \n or 5: exponents\n");
        
        scanf("%d", &opp);
        if (!(opp == 1 || opp == 2 || opp == 3 || opp == 4 || opp == 5)) {
            printf("You may have made a typo, or there is something wrong with the code. Please restart the program.\n");
        }
        printf("select your first number (no decimal, and if your doing exponents, neither of the numbers can be 10 or more, or you wont get a proper answer\n");
        scanf("%d", &x);
        printf("Select your second number (same rules apply as the first number)\n");
        scanf("%d", &y);
         z = x-y;
         w = x+y;
         s = ((double)x)/y;
         exponent = pow(x,y);
        if(opp == 5) {
            printf("%d to the power of %d is equal to %f", x, y, exponent );
        }

        if (opp == 3) {
            printf("%d multiplied by  %d is equal to  %d", x, y, x*y);
        }

        if (opp == 4) {
            printf(" %d divided by  %d is equal to %f", x, y,s);
        }
        /* 9 divided by 3 is equal to 3*/
        if (opp == 1) {   
            printf("%d plus %d is equal to %d", x, y, w);
        }
        if (opp == 2){
            printf("%d minus %d is equal to %d", x, y, z);
        }
        printf("\nThank you so much for using my calculator app, and if you want you can restart the app to try to do different equations.\n");
        
}
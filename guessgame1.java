import java.util.Scanner;

public class guessgame1 {
    public static void guessnum(){
        int i,guess,k;
        Scanner sc=new Scanner(System.in);
        int compuguess=1+(int)(100*Math.random());
        System.out.println("Enter the number of trials");
        k=sc.nextInt();
        System.out.println("the number to be guessed between 1-100"+" within "+k+ " trials");

        for(i=0;i<k;i++)
        {   System.out.println("   ");
            System.out.println(" guess the number ");
            guess=sc.nextInt();
            if(compuguess==guess)
            {
                System.out.println("You have guessed the correct number ");
                break;
            }
            else if(compuguess>guess && i<k-1)
            {
                System.out.println("the number is greater than "+ guess + " in "+" "+(i+1) +" trial" );
            }
            else if(compuguess<guess && i<k-1)
            {
                System.out.println("the number is less than "+ guess +" in "+" "+(i+1) +" trial");
            }

        }
        if(i==k)
        {
            System.out.println("you have used all your trials");
            System.out.println("The correct number was "+compuguess);
        }
    }
    public static void main(String[] args) {
        guessnum();
    }
}

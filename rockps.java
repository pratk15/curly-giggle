import java.util.Random;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner6;

public class rockps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("select 0 for rock,1 for paper and 2 for scissors ");
        int userinput=sc.nextInt();
        Random r=new Random();
        int computerinput=r.nextInt(3);

        if(userinput==computerinput)
        {
            System.out.println("its a draw ");
        }
        else if(userinput==0 && computerinput==2 || userinput==1&&computerinput==0||userinput==2&&computerinput==1)
        {
            System.out.println("you have won the game");
        }
        else
        {
            System.out.println("computer won ");
        }
        
        if(computerinput==0)
        {
            System.out.println("computerinput was rock");
        }
        else if(computerinput==1)
        {
            System.out.println("computerinput was paper");
        }
        else
        {
            System.out.println("computerinput was scissor");
        }
    }
    
}

import java.util.Scanner;
public class slotMachine
{
    public static void main(String[] args)
    {
        boolean run = true;
        
        double creddits = 100;
        
        
        Scanner scan = new Scanner(System.in);
        
        while(run == true)
        {
        
        Machine slot1 = new Machine();
        Machine slot2 = new Machine();
        Machine slot3 = new Machine();
      
        double multiplyer = 1;
        
       
      

        
        System.out.println("you have " + creddits + " creddits");
      
        Scanner bet = new Scanner(System.in);
        System.out.println("Please enter bet ammount");
        double betAmmount = bet.nextDouble();
        creddits = creddits - betAmmount;
        if (creddits < 0 )
        {
            creddits = creddits + betAmmount;
            System.out.println("you have insufficient funds");
        }
        else
        {
     
        bet.nextLine();
          //spinning slot
          
        int roll1 = slot1.roll();
        int roll2 = slot2.roll();
        int roll3 = slot3.roll();
      
           System.out.println(roll1 + "|" + roll2 + "|" + roll3);
        if(roll1 == roll2 && roll1 == roll3)
        {
            if (roll1 == 1)
            {
                multiplyer = 20;
            }
            else if (roll1 == 2)
            {
                multiplyer = 17.5;
            }
            else if (roll1 == 3)
            {
                multiplyer = 15;
            }
            else if (roll1 == 4)
            {
                multiplyer = 10;
            }
            else if (roll1 == 5)
            {
                multiplyer = 7.5;
            }
            else 
            {
                multiplyer = 5;
            }
            System.out.println("Congragulations! you just won " + betAmmount * multiplyer + " creddits!");
            creddits = (betAmmount * multiplyer) + creddits;
        }
        else if (roll1 == roll2)
        {
         
            if (roll1 == 1)
            {
                multiplyer = 10;
            }
            else if (roll1 == 2)
            {
                multiplyer = 7.5;
            }
            else if (roll1 == 3)
            {
                multiplyer = 5;
            }
            else if (roll1 == 4)
            {
                multiplyer = 3.5;
            }
            else if (roll1 == 5)
            {
                multiplyer = 2;
            }
            else 
            {
                multiplyer = 1.5;
            }
            System.out.println("Congragulations! you just won " + betAmmount * multiplyer + " creddits!");
            creddits = (betAmmount * multiplyer) + creddits;
      
        }
        else if (roll1 == roll3)
        {
            if (roll1 == 1)
            {
                multiplyer = 10;
            }
        //bars 15x
            else if (roll1 == 2)
            {
                multiplyer = 7.5;
            }
        //bell 10x
            else if (roll1 == 3)
            {
                multiplyer = 5;
            }
        //horse shoe 7.5x
            else if (roll1 == 4)
            {
                multiplyer = 3.5;
            }
        //hearts 5x 
            else if (roll1 == 5)
            {
                multiplyer = 2;
            }
            else 
            {
                multiplyer = 1.5;
            }
                System.out.println("Congragulations! you just won " + betAmmount * multiplyer + " creddits!");
                creddits = (betAmmount * multiplyer) + creddits;
        }
        else if (roll2 == roll3)
        {
            if (roll2 == 1)
            {
                multiplyer = 10;
            }
            else  if (roll2 == 2)
            {
                multiplyer = 7.5;
            }
            else  if (roll2 == 3)
            {
                multiplyer = 5;
            }
            else  if (roll2 == 4)
            {
                multiplyer = 3.5;
            }
            else if (roll2 == 5)
            {
                multiplyer = 2;
            }
            else 
            {
                multiplyer = 1.5;
            }
                System.out.println("Congragulations! you just won " + betAmmount * multiplyer + " creddits!");
                creddits= (betAmmount * multiplyer) + creddits;
        }
        else 
        {
            System.out.println("better luck next time");
        }
        
        
        }
        
        System.out.println();
        System.out.println("would you like to play again? y/n");
        System.out.println();
        
        }
        
       String again = scan.nextLine();
        if(again == "n")
        {
            run = false;
        }
        else if(again == "y")
        {
            run = true;
        }
        
    }
}



import java.util.Scanner;
public class DiceGame
{
  public static void main(String[] args)
  {
    
    
   slot1 = new Machine()
   slot2 = new Machine()
   slot3 = new Machine()
      
      int creddits = 100;
      
      System.out.println("you have" + creddits + " creddits");
      
      
      Scanner bet = new Scanner(System.in);
      System.out.println("Please enter bet ammount");
      double betAmmount = bet.nextDouble();
      creddits = creddits - betAmmount
      
      System.out.println("pres any key to spin");
      bet.nextLine();
      //spinning slots
   
      
      int roll1 = slot1.roll();
      int roll2 = slot2.roll();
      int roll3 = slot3.roll();
      
       if r1 == 1 
       return r1 = "lemon"
       
       else if r1 == 2
       return r1 = "diamond"
       
       else if r1 == 3 
       return r1 = "seven"
       
       else if r1 == 4 
       return r1 = "horse shoe"
       
       else if r1 == 5
       return r1 = "bars"
       
       else if r1 == 6
       return r1 = "cherry"
       
       else if r1 == 7 
       return r1 = "heart"
       
       else if r1 == 8 
       return r1 = "bell"
       
       else if r1 == 9 
       return r1 = "bell"


      
      
      // game winning 
      if  slot1 == slot2 == slot3;
      
      return 
          
      // multiplyer for winning 
     
      // all fruits 3.5x
      multiplyer = 3.5
      
        // seven 20x
        if slot1 == "seven"
        multiplyer = 20
        
        //bars 15x
        else if slot1 == "bars"
        multiplyer = 15
        
        //bell 10x
        else if slot1 == "bell" 
        multiplyer = 10
        
        //horse shoe 7.5x
        else if slot1 == "horse shoe"
        multiplyer = 7.5
        
        //hearts 5x 
        else if slot1 == "heart"
        multiplyer = 5
      
      System.out.println("Congragulations! you just won" + betAmmount * multiplyer + "creddits!")
      creddits = (betAmmount * multiplyer) + creddits
      // dont win 
      else 
      return "better luck next time"
 
  }
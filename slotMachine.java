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
      
//wheel 1
       if roll1 == 1 ;
       return roll1 = "lemon";
       
       else if roll1 == 2;
       return roll1 = "diamond";
       
       else if roll1 == 3 ;
       return roll1 = "seven";
       
       else if roll1 == 4 ;
       return roll1 = "horse shoe";
       
       else if roll1 == 5;
       return roll1 = "bars";
       
       else if roll1 == 6;
       return roll1 = "cherry";
       
       else if roll1 == 7 ;
       return roll1 = "heart";
       
       else if roll1 == 8 ;
       return roll1 = "bell";
       
       else if roll1 == 9; 
       return roll1 = "bell";
//wheel 2

       if roll2 == 1 ;
       return roll2 = "lemon";
       
       else if roll2 == 2;
       return roll2 = "diamond";
       
       else if roll2 == 3 ;
       return roll2 = "seven";
       
       else if roll2 == 4 ;
       return roll2 = "horse shoe";
       
       else if roll2 == 5;
       return roll2 = "bars";
       
       else if roll2 == 6;
       return roll2 = "cherry";
       
       else if roll2 == 7 ;
       return roll2 = "heart";
       
       else if roll2 == 8 ;
       return roll2 = "bell";
       
       else if roll2 == 9; 
       return roll2 = "bell";
       
 //wheel 3

       if roll3 == 1 ;
       return roll3 = "lemon";
       
       else if roll3 == 2;
       return roll3 = "diamond";
       
       else if roll3 == 3 ;
       return roll3 = "seven";
       
       else if roll3 == 4 ;
       return roll3 = "horse shoe";
       
       else if roll3 == 5;
       return roll3 = "bars";
       
       else if roll3 == 6;
       return roll3 = "cherry";
       
       else if roll3 == 7 ;
       return roll3 = "heart";
       
       else if roll3 == 8 ;
       return roll3 = "bell";
       
       else if roll3 == 9; 
       return roll3 = "bell";
      
      
      // game winning 
      if  roll1 == roll2 == roll3;
      
      return 
          
      // multiplyer for winning 
     
      // all fruits 3.5x
      multiplyer = 3.5;
      
        // seven 20x
        if slot1 == "seven";
        multiplyer = 20;
        
        //bars 15x
        else if slot1 == "bars";
        multiplyer = 15;
        
        //bell 10x
        else if slot1 == "bell";
        multiplyer = 10;
        
        //horse shoe 7.5x
        else if slot1 == "horse shoe";
        multiplyer = 7.5;
        
        //hearts 5x 
        else if slot1 == "heart";
        multiplyer = 5;
      
      System.out.println("Congragulations! you just won" + betAmmount * multiplyer + "creddits!");
      creddits = (betAmmount * multiplyer) + creddits;
      
      else if roll1 == roll2 
      
      else if roll1 == roll3
      
      else if roll2 == roll3
      // dont win 
      else 
      return "better luck next time";
 
  }
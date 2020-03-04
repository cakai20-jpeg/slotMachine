# slotMachine
My mini project is a slot machine that takes in user input for a bet amount and is able to keep track of your winnings as you gain and lose money. Also you get different returns based on the number you match.
It works by setting up a constructor that generates a number between 1 and 9. Then into the main method it loops with a while statement and it calls that file 3 times to mimic the 3 wheels of a slot machine. After that it checks if you win or not based if it is 3 in a row or two of the 3 outcomes match. After each roll it asks if you want to stop by ending the while loop. 


After I had help from Mr. Kiang with my spacing this helped with the organization of my code and enabled me to add to my code making adjustments later on. 

After my spacing was cleaner I was able to figure out why my while loop would not end with an if else statement since it was inside of the while loop. But after I placed it out of the loop it was able to end the while loop since it was outside of it. 

I also had issues with gaining 100 credits after each round. This was because the variable for credits was inside of the while loop so each time the game repeated it would add 100 credits to someone's balance. 

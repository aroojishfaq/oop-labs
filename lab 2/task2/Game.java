import java.util.Scanner;
import java.util.Random;

public class Game{
public static void main(String args[])
 {
  int n=0,num,i;
  Random rand=new Random ();
  num=1+rand.nextInt(100);

  System.out.println("              Choose a number between 1 to 100          ");

  System.out.println("            ****You have 10 tries to guess a number*****");  

  for (i=1;i<11;i++)
    {  System.out.println("Enter Guess number for attempt: "+i );
       Scanner input=new Scanner (System.in);
        n=input.nextInt();

       if (n<num){
           System.out.println("entered number is smaller than a random number to be guessed");
        }
   
       else if (n>num){
           System.out.println("entered number is greater than a random number to be guessed");
        }

       else if (n==num){
          System.out.println("You won");
          break;
         }
    
 }
     if (n!=num){
             System.out.println("You lose"); 
        }

    }
 }
 
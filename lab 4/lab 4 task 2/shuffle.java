import java.util.*;
/**
 * Write a description of class shuffle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class shuffle
{
public static void main(String args[]){
    ArrayList<Integer> num=new ArrayList<Integer> ();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(4);
    num.add(5);
    num.add(6);
    
    System.out.println("Original List : \n" + num); 
  
        Collections.shuffle(num); 
  
        System.out.println("\nShuffled List : \n" + num); 
    } 
} 

    
    

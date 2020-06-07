import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class reverse
{
    public static void main(String args[]){
        /*ArrayList<String> alpha=new ArrayList<String>() ;  
        for(char i=65; i<73; i++){
            alpha.add(Character.toString(i));       
        }

        
        ListIterator i= alpha.listIterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
            
        }
        System.out.println();

        
        // iterator = alpha.listIterator(); 

        while (i.hasPrevious()){ 
            System.out.print(i.previous()+"\n"); 
        } */
         ArrayList<Integer> num=new ArrayList<Integer> ();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(4);
    num.add(5);
    num.add(6);
    
    System.out.println("Original List : \n" + num); 
  
        Collections.reverse(num);
  
        System.out.println("\nReversed List : \n" + num); 
    }
}


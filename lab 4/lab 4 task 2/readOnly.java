import java.util.*;
/**
 * Write a description of class readOnly here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class readOnly
{public static void main(String ars[]){
     ArrayList<Integer> num=new ArrayList<Integer> ();
    num.add(1);
    num.add(2);
    num.add(3);
    num.add(4);
    num.add(5);
    num.add(6);
    
     System.out.println(num);
  
       List<Integer> num1= Collections.unmodifiableList(num); 
        num1.add(3);
        
     System.out.println(num1);
         System.out.println("Collection is read-only now.");
  
      
}
}
import java.util.*;
/**
 * Write a description of class stat5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class stat5
{
    public static void main(String[] args) { 
        
         List list = Arrays.asList("1 -2 3 -4 5 6 1 3 -4".split(" ")); 
        
       System.out.println(list);   
        System.out.println("max: " + Collections.max(list)); 
        System.out.println("min: " + Collections.min(list));
        //the compiler first convert them into ASCII code and then compare them
       // all according to ASCII code.
    }
}
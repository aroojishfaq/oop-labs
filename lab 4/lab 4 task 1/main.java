import java.util.ArrayList;
import java.util.*;
import java.util.Iterator;
/**
 * Write a description of class main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[]){
        ArrayList<String> alpha=new ArrayList<String>() ;  
        for(char i=65; i<73; i++){
            alpha.add(Character.toString(i));       
        }

        System.out.println(alpha);
        ListIterator i= alpha.listIterator();
        System.out.println("The ArrayList elements are:");
        while (i.hasNext()) {
            System.out.println(i.next());
        }

        for(int j=0;j<alpha.size();j++){
            String a=alpha.get(j)+"+";
            alpha.set(j,a);
        }
        System.out.println(alpha);

        //ListIterator iterator = alpha.listIterator(); 

        while (i.hasPrevious()){ 
            System.out.print(i.previous()+"\n"); 
        } 
    }
}


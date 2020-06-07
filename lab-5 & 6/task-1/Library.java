
import java.util.*;
public class Library
{
   HashMap<String , Book> map= new HashMap<String , Book>();
   public void addBooks(String value , Book key){
       if (map.get(key )==null){
           map.put(value, key);
        }
    }
     public Book search(String key){
         return map.get(key);

        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        }
    
}

import java .io.FileNotFoundException;
import java .util.Scanner;
import java .io.File;

public class WordCount
{
 public static void main (String args[]) throws FileNotFoundException{
    String filename=args[0];
    File file=new File(filename);
    Scanner files=new Scanner(file);
    int wordCount=0;
while(files.hasNextLine()){
 String nextLine=files.nextLine();
 String wordsInLine[]=nextLine.split(" ");
 wordCount+=wordsInLine.length;

}
System.out.println("word count in file" +filename+ "is:"+wordCount);
     }
 
}
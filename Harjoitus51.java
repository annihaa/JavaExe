import java.util.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.Charset;

public class Harjoitus51
{
  Scanner scanner = new Scanner(System.in);

  public static void main(String [] args)
  {
      new Harjoitus51().diary();
  }

 public void diary()
 {
   System.out.println("Filetext text.txt contains text: ");
   while(true)
   {
     try{
       List<String> lines = Files.readAllLines(Paths.get("text.txt"), Charset.defaultCharset());
       for (String line : lines){
         System.out.println(line);
       }
     }
     catch (Exception e) {
         System.out.println("File not found.");
       }

    System.out.println("Please enter your text: -> ");
    String taketext = scanner.nextLine();
    Date date = new Date();

     try {
       PrintWriter writer = new PrintWriter(new FileOutputStream(new File("text.txt"), true));
       writer.append("\n\n" + date.toString() + ":  " + taketext);
       writer.close();
       System.out.println("Writing to file... ");
       System.out.println("Writing done.");
       break;
     }
     catch (Exception e){
       System.out.println("File cannot ne created");
     }
   }
 }
}

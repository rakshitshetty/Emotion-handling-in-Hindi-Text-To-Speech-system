import java.io.*;
import javax.sound.sampled.*;
import javax.speech.synthesis.*;

   // Displays contents of a file 
   //(e.g. java Type app.ini) 
   public class Type
     {
     public static void main(
       String args[]) throws Exception
     {
      // Open input/output and setup variables
      FileReader fr = new FileReader("E:\\sin1.wav");
    
      AudioInputStream inputStream =  
    	    AudioSystem.getAudioInputStream(new File("E:\\wavAppended1.wav")); 
    	int numBytes = inputStream.available(); 
    	byte[] buffer = new byte[numBytes]; 
    	
    	inputStream.read(buffer, 0, numBytes);
    	String value=new String(buffer);
    	System.out.println(value);
    	inputStream.close(); 

      PrintWriter pw = new PrintWriter(
        System.out, true);
      char c[] = new char[4096];
      int read = 0;

      // Read (and print) till end of file
      while ((read = fr.read(c)) != -1)
         pw.write(c, 0, read);

      // Close shop
      fr.close();
      pw.close();
     }
   }

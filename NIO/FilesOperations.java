import java.nio.file.*;
import java.io.IOException;
public class FilesOperations
{
//Create Directory  THROWS IOException, Root Folder must exists
//Create Directories
//Create File
//Move File
//Copy Files


 public static void main(String args[])

{
 
 Path p1=null;
 try
 {
 p1=Paths.get("test2/bla/bla2");
 Files.createDirectory(p1);
 }
 catch(IOException ex)
 {
  System.out.println("No existe folder test2");

 }
 try
 {
   p1=Paths.get("test/direc");
   Files.createDirectory(p1);
 }
 catch(IOException ex) 
 {
  assert false;
 }


}



}

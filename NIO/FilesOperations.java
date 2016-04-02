import java.nio.file.*;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
public class FilesOperations
{
//Create Directory  THROWS IOException, Root Folder must exists
//Create Directories CREATE ALL EVEN IF THE ROOT FOLDER SPECIFIED IN THE ARGUMENT DOESN T EXISTS
//Create File  MUST EXISTS CONTAINER FOLDER
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
 catch (FileAlreadyExistsException e)
 {
   System.out.println("la carpeta ya existe");
 }
 catch(IOException ex) 
 {
  
  assert false;
 }
 try
 {
 //Doesn't check if root folder already exists!!!
 p1=Paths.get("test3/bla2/bl4");
 Files.createDirectories(p1);
 }
 catch(IOException e)
 {
  assert false:"No deberia llegar aqui por createDirectories";
 }
}



}

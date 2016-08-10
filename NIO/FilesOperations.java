import java.nio.file.*;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
public class FilesOperations
{
//Create Directory  THROWS IOException, Root Folder must exists
//Create Directories CREATE ALL EVEN IF THE ROOT FOLDER SPECIFIED IN THE ARGUMENT DOESN T EXISTS
//Create File  MUST EXISTS CONTAINER FOLDER
//COPY  
//BY DEFAULT MOVE FILE DOESN'T REPLACE FILE
//
//ATOMIC_MOVE
//COPY_ATTRIBUTES
//REPLACE_EXISTING

//MOVE Files 


 public static void main(String args[])

{


 Path s=Paths.get("test/blam");
 Path t=Paths.get("test/kiquetal/nuevo");
try
{ 
Files.move(s,t,StandardCopyOption.REPLACE_EXISTING);
 }
catch(IOException e)
{
 System.out.println(e);
}
 Path p1,p2=null;
 try
 {
 p1=Paths.get("test2/bla/bla2");
 Files.createDirectory(p1);
 }
 catch(IOException ex)
 {
  System.out.println("No existe folder test2:error"+ex.getMessage());

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

 Path source=Paths.get("test/toCopy.txt");
 Path destination=Paths.get("test/toCopy2.txt");
//try
//{
// System.out.println(Files.copy(source,destination));
//}
//catch(IOException ex)
//{
// System.out.println("FALLO AL existir file" + ex.toString());
 //assert false:"Hubo excepcion no se puede copiar 2 veces"+ex.toString();
//} 

try
{

 p1=Paths.get("test/toCopy.txt");
 p2=Paths.get("test/moveToCopy.txt");

 Files.move(p1,p2);
}
catch(IOException e)
{
 System.out.println("No existe el file\n"+e);
}

try
{
p1=Paths.get("test/moveToCopy.txt");
p2=Paths.get("test/toCopy2.txt");
Files.move(p1,p2,StandardCopyOption.ATOMIC_MOVE);

}
catch(IOException e)
{
 System.out.println("OK, DEBE FALLAR SI YA EXISTE OTRO ARCHIVO"+e.toString());
}


}
}

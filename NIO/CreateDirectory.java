import java.nio.file.*;
import java.io.IOException;
public class CreateDirectory
{



 public static void main(String args[]) throws IOException
 {

  
  Files.createDirectories(Paths.get("walk/walk1/walk1walk1/innertwo"));
  Path p=Paths.get("walk/walk1/walk1walk1/innertwo/uno.txt");
  Files.createFile(p);

 }



}

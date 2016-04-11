import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.file.DirectoryStream;
public class DirectoryStreamTest
{
/*

Files.newDirectoryStream(dir)

*/
public static void main(String args[]) throws IOException
{
  Path dir=Paths.get("test");
  try(DirectoryStream<Path> stream=Files.newDirectoryStream(dir))
  { 
  for(Path value:stream)
  {
    System.out.println(value);
  }
 }
}
}

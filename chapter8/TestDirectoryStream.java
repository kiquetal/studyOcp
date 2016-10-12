import java.io.*;
import java.nio.file.*;
public class TestDirectoryStream
{
    public static void main(String args[]) throws IOException
    {
        Path dir=Paths.get("repos");
        try(DirectoryStream<Path> stream=Files.newDirectoryStream(dir))
            {

                for(Path value:stream)
                    {
                        System.out.println(value +":"+Files.isDirectory(value));
                    }
            }

    }
}

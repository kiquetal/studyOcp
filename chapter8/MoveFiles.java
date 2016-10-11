import java.nio.file.*;
import java.io.*;
public class MoveFiles
{
    public static void main(String args[])
    {

        Path file=Paths.get("repos/algo6");
try
    {
        //OJO this only change the NAME!!!
        //OJO cuando muevo a un directory NO se copian los archivos dentro
        Files.move(file,Paths.get("repos/algo7"));
    }

catch(IOException ex)
    {
        ex.printStackTrace();
    }

    }
}

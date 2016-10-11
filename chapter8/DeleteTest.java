
import java.io.*;
import java.nio.file.*;
public class DeleteTest
{


    public static void main(String args[])
    {

        try
            {
                Path toDelete=Paths.get("repos/algo5D");

                Files.deleteIfExists(toDelete);
            }
        catch(IOException ex)
            {
                ex.printStackTrace();
            }




    }


}

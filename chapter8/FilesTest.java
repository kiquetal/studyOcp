import java.nio.file.*;
import java.io.*;
public class FilesTest
{




    public static void main(String args[])
    {

        Path filePath=Paths.get("repos/algo");
        try
            {

                //OJO Exception when parent not exists!!!
                Files.createDirectories(Paths.get("something/another/good"));
                //         Files.createDirectory(filePath);
                Path originalFile=filePath.resolve(Paths.get("archivo.txt"));
                //  Files.createFile(filePath.resolve(Paths.get("archivo.txt")));


                Files.copy(originalFile,Paths.get("repos/algo/copia.txt"),StandardCopyOption.REPLACE_EXISTING);

            }
        catch(IOException ex)
            {
                ex.printStackTrace();
            }
    }

}

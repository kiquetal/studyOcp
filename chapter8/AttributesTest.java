
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.io.*;
public class AttributesTest
{


    public static void main(String argsp[]) throws IOException
    {

        Path p=Paths.get("repos/file/attributes.txt");
        
        System.out.println(Files.readAttributes(p,"*"));

        PosixFileAttributes posix=Files.readAttributes(p,PosixFileAttributes.class);
        System.out.println(posix);
        PosixFileAttributeView posixView=Files.getFileAttributeView(p,PosixFileAttributeView.class);
        System.out.println(posixView);
        //ReadAttributes from attributeView

        Files.getAttribute(p,"creationTime");
        //TO change
        //Files.setAttribute(p,name,Object)

    }
}

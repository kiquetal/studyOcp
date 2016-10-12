import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.*;
public class TestVisitor implements FileVisitor<Path>
{

    public FileVisitResult postVisitDirectory(Path dir, IOException ex)

    {

        return FileVisitResult.CONTINUE;
    }

    public FileVisitResult preVisitDirectory(Path dirm, BasicFileAttributes attrs)
    {
        String dirName=dirm.getFileName().toString();
            if(dirName.startsWith("code"))
            {
                return  FileVisitResult.SKIP_SUBTREE;
            }
        else
            return FileVisitResult.CONTINUE;
    }

    public FileVisitResult visitFile(Path file,BasicFileAttributes attrs)
    {


        return FileVisitResult.CONTINUE;

    }
    public FileVisitResult visitFileFailed(Path file,IOException ex)
    {
        return FileVisitResult.SKIP_SUBTREE;
    }


}

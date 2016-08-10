import java.nio.file.*;
import java.io.*;
public class Moves
{


public static void main(String args[]) throws IOException
{

Path p1=Paths.get("toMove");
Path t=Paths.get("toMove22/haha2");
Files.move(p1,t);

}

}

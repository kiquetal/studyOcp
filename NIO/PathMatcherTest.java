import java.io.IOException;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.FileSystems;

public class PathMatcherTest
{

 public static void main(String args[])
 {
 
 String pattern="*.txt";
 PathMatcher matcher=FileSystems.getDefault().getPathMatcher("glob:"+pattern);
 
 Path p=Paths.get("test/toMatch/java4.txt");
  System.out.println(p.getFileName());
  if (matcher.matches(p.getFileName()))
   System.out.println("we win");
  

 }

}

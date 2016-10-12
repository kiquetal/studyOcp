import java.nio.file.*;
public class PathMatcherTest
{


    public static void main(String argsp[])
    {

        PathMatcher pm=FileSystems.getDefault().getPathMatcher("regex:[1-9]*");

        Path file=Paths.get("12-1.txt");
        if (pm.matches(file))
            {
                System.out.println("found");
            }
    }

}

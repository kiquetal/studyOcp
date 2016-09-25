import java.nio.file.*;
public class PathsText
{

    public static void main(String args[])
    {
       Path p=Paths.get("/docs/algo/esto");
             System.out.println(p.resolveSibling(""));
                System.out.println("\n"+p.normalize());


                //DON'T INCLUDE ROOT
            System.out.println(p.subpath(0,2));


            System.out.println(p.getNameCount());
            System.out.println(p.getParent());
            System.out.println(p.getName(0));
            System.out.println();
            System.out.println(p.getRoot());
    }






}

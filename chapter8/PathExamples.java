
import java.nio.file.*;
public class PathExamples
{
    public static void main(String args[])
    {
        Path p=Paths.get("fileExample.txt");
        Path p2=Paths.get("/a/algo");
        System.out.println(p.getRoot());
        System.out.println(p.getParent());
        System.out.println(p.getFileName());
        System.out.printf("Parent %s:%n ", p2.getParent());


        //Resolve and resolveSibling

        Path p3=Paths.get("/some/text");
        System.out.println(p3.resolve("text2/test"));
        System.out.println(p3.resolve("/kiquetal/algo"));
        System.out.println(p3.resolveSibling(""));

        Path p12=Paths.get("./81.java");
        Path p13=p12.toAbsolutePath();
        System.out.println(p13);
        //Relativize
        Path p4=Paths.get("/repos/kiquetal/ocp");
        Path p5=Paths.get("/repos/kiquetal/oca");
        System.out.println(p4.relativize(p5));
        System.out.println(p5.relativize(p4));

        //Twist
        Path dir=Paths.get("code");
        Path file=Paths.get("code/java/IO.java");
        Path tricky=file.resolve(file.relativize(dir));
        Path absolute=tricky
            .toAbsolutePath();

        System.out.println(absolute);
    }
}

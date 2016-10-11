## Operate on file and directory paths with the Path class
    java.nio.file.Paths
    
    ` public static Path get(String) `
    java.nio.file.FileSystem  ` `
    java.io.File `public Path toPath`
    
    A path can refer to a NON existing file or directory.
    
    File f=new File("Hello.txt");
    Path p=f.toPath();
    
    [a link] (PathExamples.java)
    

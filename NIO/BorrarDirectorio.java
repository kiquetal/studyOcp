import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.*;
import java.nio.file.*;
import java.io.IOException;
import static java.nio.file.FileVisitResult.*;
public class BorrarDirectorio extends SimpleFileVisitor<Path>

/*






*/

{
  PathMatcher pa=FileSystems.getDefault().getPathMatcher("glob:*two");
  boolean toDelete=false;
  @Override
  public FileVisitResult visitFile(Path pa,BasicFileAttributes f)
 {

    
    
     if (toDelete) {
       try {
       Files.delete(pa);
       System.out.println("Archivo borrado");
       }
       catch(IOException ex){System.out.println("IMPOSIBLE BORRAR");}
     System.out.println("lo encontramos"+pa.toAbsolutePath());     
     //return FileVisitResult.SKIP_SIBLINGS;
      }
    
  	return FileVisitResult.CONTINUE;
      
 }

 @Override
 
 public FileVisitResult postVisitDirectory(Path p,IOException ex)
 {
   boolean terminate=false;
   String n=p.getFileName().toString();
   System.out.println("que soy" + n);
   if (n.equals("innertwo"))
    {
      try
      {
       Files.delete(p);
      terminate=true;
     System.out.println("Folder eliminado");
      }
      catch(IOException e)
      {
       System.out.println("CANT DELETE");
      }
     }
   if (!terminate)
  {
 System.out.println("NO TERMINATE");
 return FileVisitResult.CONTINUE;

  }
   System.out.println("terminate");   
   return FileVisitResult.TERMINATE;

 }
 @Override
 public FileVisitResult preVisitDirectory(Path p,BasicFileAttributes es)
{
  toDelete=false;
 String file = p.getFileName().toString();
 System.out.println("Me llamo \t"+file);
System.out.println(file.equals("innertwo"));
  if (file.equals("innertwo"))
       toDelete=true;
  else
    System.out.println("no es innertwo");
         return FileVisitResult.CONTINUE;

   


}





 public static void main(String args[]) throws IOException


 {
  BorrarDirectorio s=new BorrarDirectorio();
  Path p=Paths.get("walk/walk1");
  Files.walkFileTree(p,s);


 }


}	

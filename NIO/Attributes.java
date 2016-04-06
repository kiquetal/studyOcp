import java.nio.file.attribute.*;
import java.nio.file.*;
import java.util.Map;
import java.io.IOException;
public class Attributes
{
/*

                         BasicFileAttributes
                lastModifiedTime
		lastAccesstIME
		creationTime
		size
		isRegularFile
		isDirectory
		isSymbolicLink
		isOther
		fileKey



PosixFileAttributes			DosFileAAttributes
owner()					isReadOnly	
permissions()				isHidden
group()					isArchive	
					isSystem


Arguments to be Query in Files.readAttributes
acl
dos
posix
basic
user
owner
*/

 public static void main(String args[])
{

Path p1=Paths.get("test/attribute.txt");
lecturaPorString(p1);
lecturaPorClass(p1);
}

static void lecturaPorClass(Path p)
{
 try
 {
 PosixFileAttributes p1=Files.readAttributes(p,PosixFileAttributes.class);
 System.out.println(Files.getAttribute(p,"size"));
 System.out.println(p1.owner());
 }
 catch(IOException e)
 {
  assert false:"Excepcion en"+e.toString();
 }
}
static void lecturaPorString(Path p)
{

try
{
//basic:isDirectory,lastAccessTime
Map<String,Object>m=Files.readAttributes(p,"basic:*");
System.out.println(m);
 
}
catch(IOException ex)
{
 assert false:"Exception en"+ex.toString();
}


try
{
 Files.getAttribute(p,"basic:isOther");

}
catch(IOException ex)
{
assert false:"NO DEBERIA LLEGAR AQUIE!!";
}
try
{
 Files.getAttribute(p,"kiquetal");
}
catch(Exception ex)
{
System.out.println("OK, no existe el attributo"+ex.toString());
}


}


}

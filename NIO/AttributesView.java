import java.nio.file.*;
import java.nio.file.attribute.*;
import java.io.IOException;
import java.util.Map;

public class AttributesView
{
/**

                  			FileAttributeView
					


FileOwnerAttributeView-------                	    ---BasicFileAttributeView			UserDefinedAttributeView
 setOwner()           	     \                    / 	name()		 \			write()
 getOwner()           	      \                  /   	readAtttributes() \			delete()
 name()		  	       \                /	setTimes	   \			read()
                  	        \              /			    \			size()
AclFileAttributeView         PosixFileAttributeView                    DosFileAttributeView
getAcl()                      setPermissions()				setReadOnly() 
setAcl()		      setGroup()				setHidden()
			      name()					setSystem()
									setArchive()

**/


  public static void main(String args[])
{

 Path p1=Paths.get("test/toRead.txt");
 readAttributesViews(p1);
}

static void readAttributesViews(Path p)
{

try
{
Map<String,Object> m=Files.readAttributes(p,"*");
System.out.println(m);
BasicFileAttributeView v=Files.getFileAttributeView(p,BasicFileAttributeView.class);

FileOwnerAttributeView fil=Files.getFileAttributeView(p,FileOwnerAttributeView.class);
System.out.println(fil.getOwner()+"-"+fil.name());
		


}
catch(IOException ex)
{

 assert false:"No deberia llegar aqui";
}

 


}


}

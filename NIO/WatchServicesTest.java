import java.nio.file.*;
import java.io.*;
import static java.nio.file.StandardWatchEventKinds.*;
public class WatchServicesTest
{

 public static void main(String args[])
 {
  WatchService w=null;//FileSystems.getDefault().newWatchService();
 

  try
  {
      w=FileSystems.getDefault().newWatchService();
      Path pa=Paths.get("test/direc");
      pa.register(w,ENTRY_MODIFY,ENTRY_DELETE,ENTRY_CREATE);
      WatchKey key=null; 
 
    for(;;)
     { 
        key=w.take();
        for(WatchEvent<?> event:key.pollEvents())
        {
         WatchEvent.Kind<?>kind=event.kind();
         Path p=((WatchEvent<Path>)event).context();
         
        if (kind== ENTRY_CREATE)
           System.out.println("he creado");
         
        if (kind== ENTRY_MODIFY)
          System.out.println("HE modificado");
        if (kind ==ENTRY_DELETE)
          System.out.println("he borrado");
         
         
         if (!key.reset())
             break;

 
        } 
 


    }

 }
 catch(IOException  | InterruptedException e)
 {
  System.out.println(e);
 }

 }



}

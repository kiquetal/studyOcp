import java.nio.file.*;
import java.io.*;
public class TestWatchServices
{

    public static void main(String args[]) throws IOException,InterruptedException
    {

        try(WatchService wc=FileSystems.getDefault().newWatchService();)
            {
                
                Path p1=Paths.get("algo");
                Path p2=Paths.get("algo2");

                p1.register(wc,StandardWatchEventKinds.ENTRY_MODIFY,
                               StandardWatchEventKinds.ENTRY_DELETE,
                               StandardWatchEventKinds.ENTRY_CREATE);

                WatchKey key=null;

                while(true)
                    {

                        key=wc.take();
                        for(WatchEvent<?> watchEvent:key.pollEvents())
                            {

                                WatchEvent.Kind<?> kind=watchEvent.kind();



                            }

                        if(!key.reset())
                            break;
                    }

            }
            

    }

}

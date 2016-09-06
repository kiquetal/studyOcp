import java.security.SecureRandom;
public class PrintTask implements Runnable
{
    private final static SecureRandom generator=new SecureRandom();
    private final int sleepTime;
    private final String taskName;
    public PrintTask(String taskName)
    {
        this.taskName=taskName;
        sleepTime=generator.nextInt(5000);
    }

    public void run()
    {
        try
            {
                System.out.printf("%s going to sleep for %d.%n",taskName,sleepTime);
                Thread.sleep(sleepTime);

            }

        catch(InterruptedException ex)
         {
             ex.printStackTrace();
             Thread.currentThread().interrupt();
         }
        System.out.printf("%s done sleeping%n",taskName);
    }
}

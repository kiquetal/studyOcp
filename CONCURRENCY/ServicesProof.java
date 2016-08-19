import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
public class ServicesProof
{

    public static void main(String args[])
    {

        Task tk1=new Task("task1");
        Task tk2=new Task("task2");
        System.out.println("init everything");
        ExecutorService threadExecutor=Executors.newCachedThreadPool();
        threadExecutor.execute(tk1);
        threadExecutor.execute(tk2);

        threadExecutor.shutdown();
        System.out.println("finalizado everything");

    }



}
class Task implements Runnable
{

    private String name;
    public Task(String name)
    {
        this.name=name;
    }
    @Override
    public void run()
    {
        try
            {

                System.out.println("probando sleep");
                Thread.sleep(1200);
            }
        catch(InterruptedException e)
            {
                System.out.println("Hubo exception en "+e.getMessage());
            }
        System.out.println("Probando este"+this.name);
    }
}

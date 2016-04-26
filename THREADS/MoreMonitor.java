public class MoreMonitor extends Thread
{
private RealObject r;
 MoreMonitor(RealObject oc)
{
r=oc;
}

public void run()
{

  synchronized (r)
  {
       System.out.println("Esperare soy"+Thread.currentThread().getName());
       try {
         r.wait();
       }
       catch(InterruptedException ex)
      {
          System.out.println(ex.toString());
      }
       System.out.println("Me desperte"+Thread.currentThread().getName());
       System.out.println(r.valor);


 

  }
 System.out.println("que haces");



}
public static void main(String args[])
{
 RealObject o=new RealObject();
 new MoreMonitor(o).start();
 new MoreMonitor(o).start();
 new MoreMonitor(o).start();
 new Thread(o).start();

}



}
class RealObject extends Thread
{
 int valor=0;

  public void run()
  {
    synchronized(this)
    {
      for (int i=0;i<100;)
    {

    valor=i++;
    }
    notifyAll();


    }


  
}

}



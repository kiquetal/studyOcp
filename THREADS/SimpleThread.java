/*

   Important methods from Thread


isAlive()
isDaemon()
static interrupted()
getState()
getId()
getName()
static currentThread
static getAllStackTraces
static sleep
yield()


*/
import java.util.concurrent.TimeUnit;
public class SimpleThread

{
 public static void main(String args[])
{

    //OJO static Method only static members!!! damn it kiquetal!

     T1 t1=new T1();

     //you can call only one start! 
     t1.start();
  //  t1.start();// will thrown RunTimeError
     System.out.println(Thread.currentThread().getName());
     t1.interrupt();

 
}



}
class T1 extends Thread
{
  @Override
  public void run()
  {
   System.out.println("before sleep");
   try
   {
   TimeUnit.SECONDS.sleep(15);
   }
   catch(InterruptedException ex)
  {

   ex.printStackTrace();
  
   }

  System.out.println("lol");
 
  }




}


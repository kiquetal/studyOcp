public class SimpleProducerConsumer
{


 public static void main(String args[])

{

  Account c=new Account();

  Thread con=new Consumer(c);
  Thread p=new Producer(c);
   con.setName("producerThread");  
 p.start();
  con.start();
  
 try
 
{
p.join();
con.join();
}
catch(InterruptedException ie)
{


}

}



}
class Consumer extends Thread
{

private Account ac;


Consumer(Account a)
{

 this.ac=a;
}

public void run()
{

   for (int i=0;i<15;i++)
{
 System.out.println("decrement");
 this.ac.decrement();
 System.out.println(this.ac.val());
}



}


}
class Producer extends Thread
{
private Account acc;

 Producer(Account c)
{

this.acc=c;

}


public void run()
{

   for (int i=0;i<15;i++)
{
System.out.println("increment");
this.acc.add();
System.out.println("val"+this.acc.val());

}



}


}
class Account

{
 private double value=0.0;
 

public  void add()
{
   
   

   System.out.println("sumar");
try
{
 Thread.sleep(10);
}
catch(InterruptedException ie)
{

}  
 value=value+2;
  // notify();


}

public  double val()
 { 


   return value;
  }

public void decrement()
{
  
  //notify();
try
{
 Thread.sleep(10);
}
catch(InterruptedException ie)
{

}
 value=value-1;
// notify();


}
}

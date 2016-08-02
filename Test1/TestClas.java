public class TestClas implements Runnable
{
 volatile int x;

 @Override
 public void run()
	{
   x=5;

	}
 public static void main(String args[])
{
TestClas tc=new TestClas();
 tc.x=10;
 new Thread(tc).start();
 System.out.println(tc.x);

} 

}


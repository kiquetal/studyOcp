/*
  Very basic example using the Singleton Pattern.
  Be sure that the constructor doesn't require
  parameters and has private constructor also
  generally the method to obtain the constructor has to be
  static,

 */
public class FirstLesson
{

    public static void main(String args[])
    {
    Runtime singleRuntime=Runtime.getRuntime();
    singleRuntime.gc();
    System.out.println(singleRuntime);
    Runtime anotherInstance=Runtime.getRuntime();
    System.out.println(anotherInstance);

    if (singleRuntime==anotherInstance)
        {
            System.out.println("are equals");
        }
    }
}

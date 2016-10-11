
public class ExceptionTest
{



     public static void doSomethingBad() {
          System.out.print("bad ");
          try {
               System.out.print("try ");
               throw new IllegalStateException();
          } catch (Exception ex) {
               System.out.print("caught ");
               throw ex;
          } finally {
               System.out.print("cleanup ");
          }
     }
     public static void main(String[] args) {
          System.out.print("app-in ");
          try {
               doSomethingBad();
               System.out.print("main-in ");
          } finally {
               System.out.print("main-out ");
          }
          System.out.print("app-out ");
     }

}

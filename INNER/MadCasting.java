interface I
{
}
interface L {
}
class A implements I
{
}
class B extends A
{
}
class C extends A
{
}
public class MadCasting
{
   public static void main(String args[])
    {
       A a=new A();
       B b=new B();
       A a1=b;
       C c=new C();
	System.out.println(a1.getClass());

//Interface without relation could compile without problem.
      B b1=(B)a1;
    }
}

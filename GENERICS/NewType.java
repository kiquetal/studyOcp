public class NewType
{


 public static void main(String args[])
{

 Box<? super Long> box=new Box<Long>(0L);


}




}
class Box<T>
{
 private T t;
 public Box(T t)
  {
   this.t=t;
  }  


 public void put(T t)
 {
   this.t=t;

 }

 public T take()
 {
  return this.t;
 }

}

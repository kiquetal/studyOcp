public class UpperBound
{



 public static void main(String args[])
{
 
  //we can pass object long or subtypeofLong!!!,null also
  Wrapper<? extends Number> w =new Wrapper<Long>(0L);
  Object n=new Object();

   w.put(1L);
 
  //Solo object reference!!!!! 
  Object l=w.take();
  
}


}

class Wrapper<T>
{
public Wrapper(T e)
{
this.t=e;

}

private T t;
public void put(T t)
{
 this.t=t;
}

public T take()
{

return t;

}
public boolean contains(T a)
{

 return a==this.t;
}
}

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
public class Colec
{

 public static void main(String args[])
{

 //Map<String,List<Integer>>m1=new HashMap<String,ArrayList<Integer>>(); //OJO ERROR fijarte en subtypes en generics!!!!

//Map<String,Sup<?,?>>m2=new HashMap<String,Sup<?,?>>(); //ok
Map<?,?>m2;//=new HashMap<?,?>(); //OJO SOLO EN NESTED ??  en el objeto
Pair2<Integer,?>lol=new Pair2<Integer,Number>();
  pruebaWildCard(lol);

}

 static void pruebaWildCard(Pair2<Integer,?> p)
{
  System.out.println(p);

}
}
interface Sup<T,T2>
{

}
class Pair<T,M> implements Sup<T,M>
{
 private T t1;
 private M m2;
 private T[] arr;
Pair(T t1, M m)
 {
  this.t1=t1;
  this.m2=m;

 }




}
class Pair2<T,M>
{

}

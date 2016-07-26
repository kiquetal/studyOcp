import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Collection;
import java.util.List;
public class Colec
{

 public static void main(String args[])
{

// Map<String,List<Integer>>m1=new HashMap<String,ArrayList<Integer>>(); //OJO ERROR fijarte en subtypes en generics!!!!

Map<String,Sup<?,?>>m2=new HashMap<String,Sup<?,?>>(); //ok
//Map<?,?>m1=new HashMap<?,?>(); //OJO SOLO EN NESTED ??  en el objeto

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

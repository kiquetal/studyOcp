import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.reflect.Array;
public class NoCompile
{



 public static void main(String args[])

{

 List ls=Arrays.asList(new String[]{"kique","tal"});
//  ls.add(4);

//List l=new ArrayList(); //warning here.
List  l=new ArrayList<Integer>();
List lm=new ArrayList<Double>();

//l.add("kiquetal");  
List<Integer> l3 = new ArrayList<>();// warning here
//l3=l;
//l3=ls;
//l.add("5"); //warning here!!!

//List<?> mn=dame(String.class);
//System.out.println(mn.getClass());
}


/*
public static <T> List<T> dame(Class<? extends T> a)
{

Object array=Array.newInstance(a,10);


return Arrays.asList((T[]) array);


}
*/

}

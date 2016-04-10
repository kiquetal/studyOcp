import java.util.*;

public class Madness
{



public static void main(String args[])

{

 System.out.println(createList(Arrays.asList(new Integer []{1,2,3})).getClass());
 List<Double>l=Arrays.asList(new String[]{"kique","tal"});
 System.out.print(l.getClass());  
}



static <T> List<T> createList(List<?> lol)
 {
    return ((List<T>) lol);
  }

}

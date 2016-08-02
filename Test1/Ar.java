import java.util.*;
public class Ar implements Comparator

{

    public int compare(Object o1, Object o2)

    {

      int s1 = ((String) o1).length();

      int s2 = ((String) o2).length();

      return s1 - s2;

    }

public static void main(String args[])
{



 Ar am=new Ar();
 String[] sa = { "d", "bbb", "aaaa" };

System.out.println(Arrays.binarySearch(sa,"nn",am));
}


}

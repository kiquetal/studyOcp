import java.util.List;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Comparator;
public class BinarySearchTest
{
    public static void main(String arghs[])
    {
        List<Integer> a=new ArrayList<>();
        a.add(new Integer(9999));
        a.add(new Integer(10));
        a.add(new Integer(55));
        a.add(new Integer(28));
        Collections.sort(a,null);
        System.out.println(Collections.binarySearch(a,55));

        Collections.sort(a,SearchComparator.INT_COMPARATOR);
        System.out.println(Collections.binarySearch(a,55));

    }


}
class SearchComparator{


    static final Comparator<Integer>INT_COMPARATOR=new Comparator<Integer>()
                     {
                     public int compare(Integer i1,Integer i2)
                         {
                             return i2.compareTo(i1);
                         }
        };

}

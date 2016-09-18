import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class CollecTest
{

    public static void main(String args[])
    {
        List<Integer>integers=new ArrayList<>();
        integers.add(new Integer(200));
        integers.add(new Integer(87));
        integers.add(new Integer(999));

        for (Integer i: integers)
            {
                System.out.println(i);
            }
        System.out.println("After calling Collections.sort");
        Collections.sort(integers);
        for (Integer i:integers)
            {
                System.out.println(i);
            }
    }


}

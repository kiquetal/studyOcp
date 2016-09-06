import java.util.*;
public class TreeMapTest
{



    public static void main(String args[])
    {

        TreeMap<String,String> t=new TreeMap<>();
        t.put("a","apple");
        t.put("aa","apple1");
        t.put("b","boy");
        t.put("bb","oy2");
        t.put("c","cat");
        t.put("cc","cat1");

        System.out.println(t);

        NavigableSet set=new TreeSet();
        set.add("1");
        set.add("3");
        set.add("4");
        set.add("6");
        set.add("8");

        System.out.println(set.ceiling("2"));

    }
}

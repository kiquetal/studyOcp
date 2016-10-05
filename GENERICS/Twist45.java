import java.util.Set;
import java.util.HashSet;
public class Twist45
{

    public static void main(String ags[])
    {
        Class1 c=new Class1();
        HashSet<Person> set=new HashSet<Person>();
        Person p1=new Person("Harry");
        Person p2=new Person("Shreya");
        Person p3=new Person("Selvan");
        Person p4=new Person("Shreya");
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        for(Person p: set)
            System.out.println(p);
    }

 private class Class1
    {

    }
}
class Person
{
    String name;
    Person(String name)
    {
        this.name=name;
    }
    public String toString()
    {
        return this.name;
    }

    public int hashCode()
    {
        return 10;
    }
}

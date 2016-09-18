import java.util.TreeSet;
import java.util.Comparator;
import java.util.Iterator;
public class Twist
{

    public boolean comparation(Person p1 ,Person p2)
    {

        return p1>p2;

    }
    public static void main(String []args)
    {
        TreeSet<Person> set=new TreeSet<>(new Comparator<Person>()
                                {
                                   public int compare(Person p1,Person p2)
                                              {
                                                  return (p1.age-p2.age);
                                              }

            });

        Person p1=new Person("Shreya",12);
        Person p2=new Person("Harry",40);
        Person p3=new Person("Paul",30);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator<Person> it=set.iterator();
        while(it.hasNext())
            {
                System.out.println(it.next());
            }
    }

}
class Person implements Comparable<Person>
{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;

    }
    public int compareTo(Person p)
    {
        return this.name.compareTo(p.name);
    }
    public String toString()
    {
        return name;
    }
}

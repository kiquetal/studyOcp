import java.util.List;
import java.util.ArrayList;
import static java.util.Collections.*;
public class Listas
{

    public static void main(String args[])
    {
        List<Person>listas=new ArrayList<>();

        listas.add(new Person("kiquetal",2));
        listas.add(new Person("another",23));
        listas.add(new Person("fior",1));
        sort(listas);

        System.out.println(listas);

    }

}
class Person implements Comparable<Person>
{
    private String name;
    private int age;
    Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public int compareTo(Person p)
    {

        return this.age-p.age;
    }

    public String toString()
    {

        return "{"+"name:"+this.name+"age:"+this.age+"}";
    }


}

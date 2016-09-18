import java.util.Arrays;
public class SortTest
{

    public static void main(String args[])
    {

        int [] intArray={20,14,4,10,5,3};
        for (int i:intArray)
            {
                System.out.print(i+" ");
            }
        Arrays.sort(intArray);
        System.out.println();
        for (int a:intArray)
            {
                System.out.print(a+" ");
            }

        System.out.println();
        intArray=new int[]{20,14,4,10,5,3};
        for(int a:intArray)
            {
                System.out.print(a+" ");
            }
        System.out.println();
        Arrays.sort(intArray,1,5);
        for(int b:intArray)
            {
                System.out.print(b+" ");
            }

        Person p1=new Person("Shreya",32);
        Person p2=new Person("Harry",40);
        Person p3=new Person("Paul",30);
        Person [] arrayPerson=new Person[]{p1,p2,p3};
        Arrays.sort(arrayPerson);
        for (Person p:arrayPerson)
            {
                System.out.println(p);
            }
    }
}
class Person{
    String name;
    int age;
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
    }
    public int comparteTo(Person p)
    {
        return this.age - p.age;
    }
    public String toString()
    {
        return this.name+""+age;
    }
}

import java.util.Map;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.TreeMap;
public class ProofTreeMap
{

public static void main(String args[])
{
 Map<String,Dog> m=new TreeMap<>();
 
m.put("dog1",new Dog());
m.put("dog2",new Dog());

String name="as";
List<String> n=createList();
Set<Class<?>>algo=new HashSet<>();
//Map<String,Map<Integer,String>> algo =new HashMap<String,Map<Integer,String>>();
System.out.println(n);
algo.add(new String("as").getClass());
System.out.println(algo);

/*
Animal a[]=new Cat[2];
a[0]=new Animal();
a[1]=new Cat();

*/
}

static <T>  List<T> createList()
{


  List<T> nm=new ArrayList<>();

 return nm;

}




}
class Dog
{

 private String name;
 private int age;




}
class Animal
{
}
class Cat extends Animal
{
}

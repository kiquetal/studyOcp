import java.io.*;
public class ObjectInputTest
{
    public static void main(String args[]) throws Exception
    {

        try
            (FileOutputStream out=new FileOutputStream("object.data");
             ObjectOutputStream ob=new ObjectOutputStream(out);
             FileInputStream in=new FileInputStream("object.data");
             ObjectInputStream oin=new ObjectInputStream(in);)
            {
            Child c=new Child();
        c.parent="soy lo que shoy";
        c.childName="kiquetal";
        ob.writeObject(c);
            ob.flush();
            Child c2=(Child) oin.readObject();
            System.out.println(c2.childName);
            System.out.println(c2.parent);

            }
    }
}
class Parent
{
    String parent="value";
}
class Child extends Parent implements Serializable
{


    String childName="child";


}

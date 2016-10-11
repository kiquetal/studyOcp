import java.io.*;

    class Vehicle
    {
	    int name=12;
        //String name="Vehice";
    }
    class Car extends Vehicle implements Serializable
    {


        String model="Luxury";


    }

public class ParentNotSerializable
{
    public static void main(String args[]) throws Exception
    {
        try(FileOutputStream out = new FileOutputStream("object2.data");
            ObjectOutputStream oos=new ObjectOutputStream(out);
            FileInputStream in=new FileInputStream("object2.data");
            ObjectInputStream ois=new ObjectInputStream(in))

        {
            Car c=new Car();
            oos.writeObject(c);
            oos.flush();
            Car c2=(Car)ois.readObject();
            System.out.println(c2.name+" :"+c2.model);
        }

    }
}

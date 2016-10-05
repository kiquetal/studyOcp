import java.util.List;
import java.util.ArrayList;
public class GenericsTest
{

    public static void main(String args[])
    {

        List l=new ArrayList();
		ArrayList l2=new ArrayList();
		printClass(l);
		printClass(l);
   //     System.out.println(l.getClass());
    }

	static void printClass(ArrayList l)
	{
	System.out.println("implementing class");
	System.out.println(l.getClass());

	}	
	static void printClass(List l)
	{

	System.out.println(l.getClass());
	}


}

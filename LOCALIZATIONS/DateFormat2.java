import java.text.DateFormat;

public class DateFormat2
{

	public static void main(String args[])
	{
	DateFormat defaultt=DateFormat.getDateTimeInstance();
	
try
{
    System.out.println(defaultt.parse("2012-03-21"));	 
}
catch(Exception ex)
{ 

 System.out.println(ex.toString());
}	
	}


}

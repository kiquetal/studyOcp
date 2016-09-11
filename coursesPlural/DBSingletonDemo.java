public class DBSingletonDemo
{

    public static void main(String args[])
    {

        DBSingleton al=DBSingleton.getInstance();
        DBSingleton al2=DBSingleton.getInstance();
        System.out.println("Lo que encontre"+al+ "equals" + (al==al2));

    }



}

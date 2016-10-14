import java.io.*;
public class TestConsole

{


    public static void main(String args[])
    {
        Console con=System.console();
       String ingreso= con.readLine("Ingrese algo");
       con.format("Ingresaste %s %% %n",ingreso);
    }


}

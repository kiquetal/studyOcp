
import java.io.*;
public class TestPrintWriter
{

    public static void main(String args[]) throws Exception
    {

        try(FileWriter fw=new FileWriter("textPrint.txt");
            PrintWriter pw=new PrintWriter(fw);)
            {

                pw.write(97);
                pw.close();
            }


    }
}

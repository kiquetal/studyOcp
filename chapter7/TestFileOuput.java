import java.io.*;
public class TestFileOuput
{

    public static void main(String args[]) throws IOException
    {

        try(FileInputStream in=new FileInputStream("lectura.txt");
            FileOutputStream out=new FileOutputStream("escritura.txt"))
            {

                int data;

                while( (data=in.read())!=-1)
                    {


                        out.write(data);
                    }


            }


    }


}

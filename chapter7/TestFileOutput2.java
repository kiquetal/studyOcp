import java.io.*;
public class TestFileOutput2
{
    public static void main(String argsp[]) throws IOException
    {


        try(FileInputStream in=new FileInputStream("lectura.txt");
            FileOutputStream out=new FileOutputStream("escritura2.txt");)
            {

                int data;
                byte [] byteArr=new byte[1024];

                while( (data=in.read(byteArr))!=-1)
                    {
                        out.write(byteArr,0,data);
                    }


            }


    }
}

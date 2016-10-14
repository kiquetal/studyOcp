import java.io.*;
public class ReaderTest
{
    public static void main(String args[]) throws Exception
    {

        try(FileReader fr=new FileReader("lectura.txt");
            BufferedReader br=new BufferedReader(fr);
            FileWriter fw=new FileWriter("escrituraBuffer.txt");
            BufferedWriter bout=new BufferedWriter(fw);)
        {

            String data;
            int data2;

            while((data2=br.read())!=-1)
                  {

                      System.out.println(data2);
                      bout.write(data2);
                  }
            /*
            while( (data=br.readLine())!=null)
                {


                    System.out.println(data);

                }

            */


        }




    }
}

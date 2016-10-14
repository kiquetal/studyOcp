import java.io.*;
public class TestBufferedReader
{

    public static void main(String args[]) throws Exception
    {
        try(FileReader f=new FileReader("lectura.txt");
            BufferedReader bf=new BufferedReader(f);)
            {

                String line;

                while((line=bf.readLine())!=null)
                    {
                        System.out.println(line);
                    }

                TestBufferedWriter tb=new TestBufferedWriter();
                tb.escrituraWritter();
            }
    }

}
class TestBufferedWriter
{


    public void escrituraWritter() throws Exception
    {
        try(FileWriter fw=new FileWriter("testBufferedWriter.txt");
            BufferedWriter bfw=new BufferedWriter(fw);)
            {
                bfw.write("holaaa");
                   bfw.newLine();
                bfw.write("algo");
            }




    }



}

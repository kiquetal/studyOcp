import java.io.*;
public class TestDataInput
{
    public static void main(String args[]) throws IOException
    {

        try(FileOutputStream out=new FileOutputStream("output.data");
            DataOutputStream dout=new DataOutputStream(out);
            FileInputStream fin=new FileInputStream("output.data");
            DataInputStream dis=new DataInputStream(fin);)
            {
                dout.writeBoolean(true);
                dout.writeChar('A');
                dout.writeInt(99);
                System.out.println(dis.readInt());


            }


    }
}

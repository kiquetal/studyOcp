import java.util.Scanner;
public class TokenizerExample
{


    public static void main(String argsp[])

    {
        Scanner sc=new Scanner("The \n new \t Programmer");
        while(sc.hasNext())
            {

                System.out.println(sc.next());
            }

        int accum=0;
        sc=new Scanner("1 a 10 . 100 1000");
        for(int x=0;x<4;x++)
            {

                accum+=sc.nextInt();
            }
        System.out.println(accum);
    }


}

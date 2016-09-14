import java.util.regex.*;
public class TwistInTheTale
{

    public static void main(String args[])
    {
        String targetString="The leather in their coat made her seethe";
        String pattern1="\\Bthe\\B";
        String pattern2="\\bthe\\B";
        String pattern3="\\Bthe\\b";
        String pattern4="\\bthe|the\\b";
        Pattern p=Pattern.compile(pattern4);
        Matcher m=p.matcher(targetString);


        String str="Start startup, time to start";
        System.out.println(str.substring(0,1));
        System.out.println(str.substring(0,1).compareTo(str.substring(6,7)));
        while(m.find())

            {
                System.out.println(m.group()+"positon"+m.start());

            }



    }



}

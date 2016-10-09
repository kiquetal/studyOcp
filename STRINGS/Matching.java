import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Matching
{


    public static void main(String args[])
    {

        String str="I love Java 8! It is my favorite language. Java 9 is the "+
            " 7th version of this great programming languague.";
        boolean result=false;
        Pattern pattern=Pattern.compile("[0-7]");
        Matcher matcher=pattern.matcher(str);

        System.out.println("Original "+str);
        System.out.println("Replacemente  "+matcher.replaceAll("6"));


    }



}
 

import java.util.regex.*;
public class TestRegex
{

    public static void main(String[] args) {
        String sentence = "Unexpected expectations are expected unexpectedly.";
        Pattern pattern = Pattern.compile("([Uu]n)?expect[^a]");
        Matcher matcher = pattern.matcher(sentence);
        while (matcher.find())
            System.out.println(matcher.group());
        Object [] strs={1.0,9,null};
 System.out.printf("$%2$x-%1$.2f-%b", strs);
     //   System.out.printf("$%2d-%1$.2f-%b",strs);

    }
}

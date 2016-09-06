import static java.lang.System.out;
public class Format
{

  public static void main(String agsp[])
{

out.format("%2$s %3$s %s%n","a","c","d","e","f");
out.format("%f num;%f  - format:%<.3f %n %%", Math.PI,123.1);
out.format("%1$010.4f",3.143324);


}

}

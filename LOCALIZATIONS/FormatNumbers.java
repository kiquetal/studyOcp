import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
public class FormatNumbers
{


public static void main(String args[])
{

 double amt=12345.111;
 defaultLocale(amt);
/*
 specificLocal(Locale.UK,amt);
 specificLocal(Locale.GERMANY,amt);
 specificLocal(Locale.FRANCE,amt);
 specificLocal(Locale.US,amt);
 specificLocal(Locale.JAPAN.amt);
*/


}
static void defaultLocale(double num)
{

NumberFormat nDefault=NumberFormat.getInstance();
msg("\nDefault Locale");
msg("\nFormating:"+nDefault.format(num));

try
{
msg("parsing: "+nDefault.parse("12345.11122"));

}
catch(java.text.ParseException ex)
{

msg(ex.toString());
}


}
static void msg(String str)
{
 System.out.println(str);

}



}

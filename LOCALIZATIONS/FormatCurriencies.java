import java.text.NumberFormat;
import java.util.Locale;
public class FormatCurriencies
{


  public static void main(String argsp[])
{
 double amt=1345.12;
 defaultLocale(amt);

}

static void defaultLocale(double amt)
{
NumberFormat nDefault=NumberFormat.getCurrencyInstance();
msg("\nDefault:"+nDefault.getCurrency());
msg("Formated:"+nDefault.format(amt));

}
static void msg(String str)
{
 System.out.println(str);
}

}

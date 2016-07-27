import java.util.Locale;
import java.text.NumberFormat;
import javax.swing.*;
public class FormatCur
{
 static JTextArea j=new JTextArea();
 public static void main(String args[])
{

 JFrame f=new JFrame("Currency");
 f.getContentPane().add(j);
 f.setSize(300,400);
 double amt=1234.111;
 defaultLocal(amt);
 specificLocale(Locale.FRANCE,amt); 
f.setVisible(true);
Locale loc=Locale.FRENCH;
System.out.println(loc.getLanguage());
System.out.println(loc.getCountry());

}
static void defaultLocal(double amt)
{

 NumberFormat f=NumberFormat.getCurrencyInstance();
 msg("Defaul currency"+ f.getCurrency());
 msg("Formating:"+f.format(amt));


}
static void msg(String str)
{

 j.append("\n"+str);
}


static void specificLocale(Locale l, double amt)
{

 NumberFormat f1=NumberFormat.getCurrencyInstance(l);
 msg("Locale"+l.getDisplayCountry());
 msg("Locale Currency"+f1.getCurrency());
 msg("formating "+ f1.format(amt));

}

}

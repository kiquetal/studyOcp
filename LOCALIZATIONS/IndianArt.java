import java.io.*;
import java.util.*;
import java.text.NumberFormat;
import javax.swing.*;
import java.awt.*;
public class IndianArt
{
    JFrame f=new JFrame("BookNow");
    JLabel lTotalBooking=new JLabel();
    JLabel lWhen=new JLabel();
    JLabel lPrice=new JLabel();
    JLabel lImage;
    JButton btnBook=new JButton();
    private void buildShowUI()
    {
        f.getContentPane().setLayout(new FlowLayout());
        f.setSize(300,400);
        f.getContentPane().add(lTotalBooking);
        JPanel panel1=new JPanel();
        panel1.setLayout(new GridLayout(4,1));
        panel1.add(lWhen);
        panel1.add(lPrice);
        panel1.add(new JLabel(""));
        panel1.add(btnBook);
        f.getContentPane().add(panel1);
        f.setVisible(true);

    }
    private void setLocaleSpecificData(Locale locale)
    {
        ResourceBundle labels=ResourceBundle.getBundle("IndianProperties",locale);
        String text=null;
        text=labels.getString("total_booking");
        lTotalBooking.setText(text);
        text=labels.getString("when");
        lWhen.setText(text);
        text=labels.getString("price");
        lPrice.setText(text);
    }
    public static void main(String args[])
    {
      System.out.println(Locale.getDefault());
      IndianArt ia=new IndianArt();
      ia.setLocaleSpecificData(new Locale("pt"));
      ia.buildShowUI();
    }
}

import java.util.regex.*;
import static java.lang.System.out;
public enum EnumsTest
{
    UNKNOWN(-1),
    VISA(2),
    MASTER_CARD(3),
    AMERICAN_EXPRESS(4),
    ANOTHER_CARD(5);

    private final int cvcLength;
    EnumsTest(int cvcLength)
    {
        out.println("All constructors are called "+this);
        this.cvcLength=cvcLength;
    }


    public static void main(String args[])
    {

        out.println("comienzo del tema");

    }
    public static EnumsTest fromString(String number)
    {
        if (regVisa.matcher(number).matches())
            return VISA;
        else
                {
                    if (regMasterCard.matcher(number).matches())
                        return MASTER_CARD;


        else

                if (regAmericanExpress.matcher(number).matches())
                    return AMERICAN_EXPRESS;
                else
                    return UNKNOWN;


            }



    }

    private static Pattern regVisa=
    Pattern.compile("^4[0-9]{12}(?:[0-9]{3})?$");
    private static Pattern regMasterCard=
    Pattern.compile("^5[1-5][0-9]{14}$");
    private static Pattern regAmericanExpress=
    Pattern.compile("^3[47][0-9]{13}$");


}

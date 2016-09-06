class C{
    void m()
    {
        System.out.println("clase mayor");
    }
}
public class Probando
{

    class C
    {
        void m()
        {
            System.out.println("soy member");
        }
    }

    public static void main(String argsp[])
    {

        new Probando().go();

    }
    void go()
    {
        new C().m();
        class C
        {
            void m()
            {
                System.out.println("soy local class");
            }
        }
    }
}

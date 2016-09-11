public class LunchOrder
{
    static int num=12;
    public static class Builder
    {
        private String bread="what up";
        private String condiments;
        private String dressing;
        private int algo=LunchOrder.num;
    }

    public static Builder getBuilder()
    {

        Builder n=new Builder();
        return n;
    }

    public static void main(String args[])
    {
    System.out.println(getBuilder().bread);

    }
}

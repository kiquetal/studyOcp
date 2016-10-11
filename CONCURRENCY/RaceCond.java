
public class RaceCond
{


    public static void main(String args[]) throws InterruptedException
    {

       final LongWrapper longWrapper=new LongWrapper(0L);

        Runnable r=new Runnable()
            {
                public void run()
                {
                    for (int i=0;i<1_000;i++)
                        {

                            longWrapper.incrementValue();
                        }
                }
            };

        Thread [] threads=new Thread[1_000];
        for(int i=0;i<threads.length;i++)
            {
                threads[i]=new Thread(r);
                threads[i].start();
            }

        for(int i=0;i<threads.length;i++)
            {
                threads[i].join();
            }

        System.out.println("Value "+longWrapper.getValue());
    }



}

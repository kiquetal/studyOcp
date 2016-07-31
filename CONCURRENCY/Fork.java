import java.util.concurrent.*;
public class Fork extends RecursiveTask<Integer>
{
	private int UNIT_SIZE=15;
	private int[] values;
	private int startPos;
	private int endPos;
	public Fork(int [] values)
	{
	this(values,0,values.length);
	}
	public Fork(int [] values,int startPos,int endPos)
	{
	this.values=values;
	this.startPos=startPos;
	this.endPos=endPos;
	}
	@Override
	protected Integer compute()
	{
	final int currentSize=endPos - startPos;
	if (currentSize <= UNIT_SIZE)
	{
	System.out.println("llamando a private"+currentSize);
	return computeSum();

	}
	else
	{
	System.out.println("no llamar al private"+currentSize);
	int center=currentSize/2;
	int leftEnd=startPos+center -1;
	Fork leftSum=new Fork(values,startPos,leftEnd);
	leftSum.fork();
	int rightStart=startPos+center+1;
	Fork rightSum=new Fork(values,rightStart,endPos);
	return(rightSum.compute()+leftSum.join());
	}
	}
	private Integer computeSum()
	{
	int sum=0;
	for(int i=startPos;i<endPos;i++)
	{
	sum+=values[i];
	}
	System.out.println("Sum("+startPos+"-"+endPos+"):"+sum);
	return sum;
	}
	public static void main(String args[]) throws InterruptedException
	{
	int [] intArray=new int[100];
	java.util.Random randomValues=new java.util.Random();
	for(int i=0;i<intArray.length;i++)
	{
	intArray[i]=randomValues.nextInt(10);
	}
	ForkJoinPool fk=new ForkJoinPool();
	Fork calc=new Fork(intArray);
	System.out.println(fk.invoke(calc));
	Thread.sleep(555);
	System.out.println("luego de todo imprimo aqui");
	System.out.println("solo aqui");
}
}

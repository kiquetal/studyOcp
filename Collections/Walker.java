public class Walker {
     protected double elevation;
     protected int distance;
     int move (int data) {
          return distance += data;
     }
     protected static void getWalkerInfo(Walker w) {
	 System.out.println("i am static");     
     System.out.println(w.distance);
     }


	public static void main(String args[])
{
 Walker w = new UphillHiker();
w.move(10);
w.getWalkerInfo(w);
}
}



 class UphillHiker extends Walker {
     public double elevation;
     public int move (int data) {
          elevation += .5;
          return distance += data;
     }
     public static void getWalkerInfo(Walker w) {
          System.out.println(w.distance + "-" + w.elevation);
     }
}


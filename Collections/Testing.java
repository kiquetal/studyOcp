public class Testing
{

public static void main(String args[])
{
//	GamePlayer p = new CheckersPlayer();
//	p.printType();
//	TurnBasedPlayer p2 = new ChessPlayer();
//	p2.printType();

	Player p3 = new TurnBasedPlayer();
	p3.printType();
}
}

abstract class Player {
     String type = "Human";
     public void printType() { System.out.println(type);}
}
class GamePlayer extends Player {
    String type="algo"; 
	GamePlayer() {
          type = "Computer";
     }
 //  public void printType()
//{
 //System.out.println(type);
//}
}
class TurnBasedPlayer extends GamePlayer {
     String type = "Turn-based";

//public void printType()
//{
//System.out.println(type);
//}

}
class ChessPlayer extends TurnBasedPlayer {
   String type="hidding here";
	 ChessPlayer() {
  //        type = "Chess";
     }
//    public void printType() { System.out.println(type);}
}
class CheckersPlayer extends TurnBasedPlayer {
     CheckersPlayer() {
         type = "Checkers";
     }
 //    public void printType() { System.out.println(type);}
}


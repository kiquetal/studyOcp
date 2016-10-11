import java.io.*;
import java.util.Date;
class CharacterName implements Serializable {
    String given, sur;
}
class GameCharacter {
		CharacterName name = new CharacterName();
		int level=12, experience;
}
class PlayerCharacter extends GameCharacter implements Serializable {
    Date created = new Date();
    transient String player;
    static int numPlayers = 1;
}
public class ObjectSerializer {
    public static void main(String[] args) {
        PlayerCharacter pc = new PlayerCharacter();
        PlayerCharacter.numPlayers = 2;
        pc.name.given="Tristan"; pc.name.sur="Bolt";
        pc.level = 1; pc.experience = 1000;
        pc.player="Joshua";
        try(ObjectOutputStream strObj = new ObjectOutputStream(
                                                               new FileOutputStream("object.txt")) ) {
            strObj.writeObject(pc);

			FileInputStream in=new FileInputStream("object.txt");
			ObjectInputStream ois=new ObjectInputStream(in);
			PlayerCharacter pc2=(PlayerCharacter) ois.readObject();
			System.out.println(pc2.level);
        }catch (Exception ex) {
            System.err.print(ex);
        }
    }
}

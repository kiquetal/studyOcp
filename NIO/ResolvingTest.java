import java.nio.file.Paths;
import java.nio.file.Path;
import java.io.IOException;
public class ResolvingTest
{
  //Resolve se utiliza para UNIR algunos Paths
  //Resolve no lanza excepciones
  // Path no implementa AutoCloseable :(
  //Let's probe some variants about resolve and resolveSibling, 
  // Is about ITEM 1 
  public static void main(String args[])
 {
  
  Path p1,p2,p=null;
  try
   {
      p1=Paths.get("algo");
      p2=Paths.get("/nada/esto"); 
      p=p1.resolve(p2);
      //Si se envia un path absolute duelve ese path
      assert p.isAbsolute(): "No es absoulto!!!";
      p2=Paths.get("veamos");
      p=p1.resolve(p2);
      System.out.println(p+"fin");
      //Si se envia un path absolute 
      assert p.isAbsolute():"No es absoluto!!"; 
 }
 catch(Error e)
 {
   System.out.println("Linea 24 hemos atrapado aqui");
 } 
   //ResolveSibling elimina el ultimo hijo, OJO no importa que termine /
   p1=Paths.get("/na/nada/adonde");
   p2=Paths.get("vamos/que/hacer");
   p=p1.resolveSibling(p2);
   System.out.println(p);
   //Devuelve el parent
   System.out.println(p2.resolveSibling(""));
   System.out.println(p1.resolveSibling(""));


 }


}

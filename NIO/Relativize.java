import java.nio.file.Paths;
import java.nio.file.Path;
public class Relativize
{
//Vamos a probar el metodo relativize que es para crear el camino de un path a otro
//Probaremos los metodos toAbsolutePath, toRealPath(this is tricky) toUri()
public static void main(String args[] )

{ 

Path p1,p2,p=null;

 p1=Paths.get("/home/kiquetal");
 p2=Paths.get("/home/kiquetal/nada/uno");
 
 assert p1.relativize(p2).toString().equals("nada/uno"):"No son iguales";
 
try
{
 //Tampoco se puede ir de 2 absolute paths completamente diferentes.
 p1=Paths.get("home/kiquetal");
 p2=Paths.get("/algo");
 p1.relativize(p2);

 }
catch(Exception e)
{
 System.out.println("no se puede ir de un absolute path a un relative path");
}






}

}

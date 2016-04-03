import java.nio.file.Paths;
import java.io.IOException;
import java.nio.file.Path;
//ITEM:
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
  //ILEGAL ARGUMENT EXCEPTION
 //Tampoco se puede ir de 2 absolute paths completamente diferentes.
 p1=Paths.get("home/kiquetal");
 p2=Paths.get("/algo");
 p1.relativize(p2);

 }
catch(Exception e)
{
 System.out.println("no se puede ir de un absolute path a un relative path");
}

 p1=Paths.get("folder/uno/../dos");
 System.out.println(p1.toAbsolutePath());
 //Remove redundance 
 System.out.println(p1.normalize());

 //toRealPath checkExceptions!

 try
 {
   System.out.println(p1.toRealPath());

  }
 catch(IOException e)
 {
  System.out.println("no existe file");
 }
try
{
 p1=Paths.get("test/bla/bla2/../");
 System.out.println("Sin redunancias"+ p1.toRealPath() + "\nbefore\t"+p1.toString()); 
 assert p1.toString() != null : "No deberia de explotar";
}
catch(IOException e)
{
 assert false;
}
}

}

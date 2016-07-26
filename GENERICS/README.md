# Comparando warnings

List\<String\> s=new ArrayList()  <= warning in this line

List s=new ArrayList\<String\>();

 s.add(5) <= warning in this line



# Errors when

  Cannot instante Generic Types with Primitives Types

  Cannot create Instance of Type Parameters

  Cannot declare Static Field

  Cannot use Cast or instanceof with Parameterized Types

  Cannot create Arrays of Parameterized Types

  Cannot catch an instance type parameter
  
  Generic class cannot Extends Throwable

  Be aware of the overloaded methods with the same signature after erasure

  (list instanceof ArrayList<Integer>)  //ERROR
  (list instanceof ArrayList<?>)   ok!

  	Object[] strings = new String[2];  //OJO VER EL OBJECT, aplicable este comportamiento a los Class y Sub-class
	strings[0] = "hi";   // OK
	strings[1] = 100;    // An ArrayStoreException is thrown.

 
 public void parse(File file) throws T OK!!

# Why Generics
 
 Removing explicit casts
 Better code readibility
 Developing generic algorithms



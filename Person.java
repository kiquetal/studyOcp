public class Person {
    String name;

    public Person(String personName) {
        name = personName;
    }

    public String greet(String yourName) {
        return System.out.format("Hi %s, my name is %s", name, yourName).toString();
    }
}

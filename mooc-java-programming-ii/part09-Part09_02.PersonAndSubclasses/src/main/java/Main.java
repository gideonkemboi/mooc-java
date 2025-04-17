
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your test code here
//        ArrayList<Person> persons = new ArrayList<Person>();
//        persons.add(new Teacher("Ada Lovelace", "24 Maddox St. London W1S 2QN", 1200));
//        persons.add(new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028"));
//
//        printPersons(persons);

        /*
        An object's type decides what the methods provided by the object are. For instance, if a reference to a Student type is store in a Person type variable, only the methods defined in the Person class(and its superclass and interfaces) are available.
        However, if the Student class has overridden a method available in the Person class for instance toString(), the method that would be called is the one defined in the Student class. (Polymorphism; regardless of the variable type, the method executed is chosen based on the actual type of the object.)
        */
        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        Person olliePerson = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(olliePerson);
        Object ollieObject = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollieObject);

        Object alice = new Student("Alice", "177 Stewart Ave. Farmington, ME 04938");
        System.out.println(alice);
    }

    public static void printPersons(ArrayList<Person> persons) {
        for (Person person : persons) {
            System.out.println(person);
        }
    }

}

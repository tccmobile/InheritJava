import java.util.ArrayList;

public class Room {
    public static void main(String[] args) {
        Person one = new Person("Sue", 42);
        Student two = new Student("Carl", 17,3.5, "Junior");
        Person three = new Student("Bob",21,3.0,"Senior");

        System.out.println(one+".");
        System.out.println(two+".");
        System.out.println(three+".");

        one.haveBirthday(); // owned
        two.haveBirthday(); // inherited
        three.haveBirthday();

        System.out.println(one+".");
        System.out.println(two+".");
        System.out.println(three+".");

        //one.getGpa(); one is NOT a Student just a Person
        //three.getGpa(); compiler looks only at LHS type which is a Person

        ArrayList<Person> room = new ArrayList<Person>();

        room.add(one);
        room.add(two);
        room.add(three);

       // room.get(2).setGpa(); again looks at LHS

        System.out.println("\nPrinting our collection: ");
        for (Person item: room){
            System.out.println(item);
        }

        for (int i = 0; i < room.size(); i++) {
            room.get(i).haveBirthday();
        }

        System.out.println("\nPrinting our collection again: ");
        for (Person item: room){
            System.out.println(item);
        }

    }
}

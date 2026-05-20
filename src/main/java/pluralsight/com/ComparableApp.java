package pluralsight.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableApp {
    public static void main(String[] args) {

        /// Array list of people in family
        List<Person> myFamily = new ArrayList<Person>();
        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );

        Collections.sort(myFamily);

        /// For-each loop that iterates through the array with the comparison by last name
        for (Person somePerson : myFamily) {
            System.out.println(somePerson);
        }
    }
}

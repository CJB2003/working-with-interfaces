package pluralsight.com;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /// Compares last names
    @Override
    public int compareTo(Person otherPerson) {
        return this.lastName.compareTo(otherPerson.lastName);
    }

    /// toString method formatted | lastName, firstName: age
    @Override
    public String toString() {
        return this.lastName + ", " + this.firstName + ": " + this.age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
}

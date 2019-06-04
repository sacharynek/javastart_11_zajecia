package person;

import java.util.Objects;

public class Person {

    private String firstName, lastName, Pesel;
    private int age;
    private Address address;

    public Person(String firstName, String lastName, String pesel, int age, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        Pesel = pesel;
        this.age = age;
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Person person = (Person) o;
        return age == person.age &&
                firstName.equals(person.firstName) &&
                lastName.equals(person.lastName) &&
                Pesel.equals(person.Pesel) &&
                address.equals(person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, Pesel, age, address);
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Pesel='" + Pesel + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}

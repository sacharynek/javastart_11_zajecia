package auta.objects;

import auta.interfaces.Rentable;

public class RentableCar extends Car implements Rentable {

    private Person person = null;

    public RentableCar(String name, int prodYear, int seats) {
        super(name, prodYear, seats);
    }

    @Override
    public void rent(String firstName, String lastName, String id) {
        this.person = new Person(firstName, lastName, id);
    }

    @Override
    public void handOver() {
        this.person = null;
    }

    @Override
    public boolean isRent() {
        return person != null;
    }

    @Override
    public String toString() {
        return super.toString() + "RentableCar{" +
                "person=" + person +
                '}';
    }
}

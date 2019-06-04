package auta.objects;

public class Car extends Vehicle {

    private int seats;

    public Car(String name, int prodYear, int seats) {
        super(name, prodYear);
        this.seats = seats;
    }

    @Override
    public String toString() {
        return super.toString() + "Car{" +
                "seats=" + seats +
                '}';
    }
}

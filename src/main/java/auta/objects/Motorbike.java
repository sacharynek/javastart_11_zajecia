package auta.objects;

public class Motorbike extends Vehicle {

    private int speedLimit;

    public Motorbike(String name, int prodYear, int speedLimit) {
        super(name, prodYear);
        this.speedLimit = speedLimit;
    }

    @Override
    public String toString() {
        return super.toString()+ "Motorbike{" +
                "speedLimit=" + speedLimit +
                '}';
    }
}

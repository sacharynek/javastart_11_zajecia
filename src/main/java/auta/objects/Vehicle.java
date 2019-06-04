package auta.objects;

import auta.enums.Direction;
import auta.interfaces.Moveable;

public abstract class Vehicle implements Moveable {

    private String name;
    private int prodYear;

    private Direction direction;

    public Vehicle(String name, int prodYear) {
        this.name = name;
        this.prodYear = prodYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProdYear() {
        return prodYear;
    }

    public void setProdYear(int prodYear) {
        this.prodYear = prodYear;
    }

    @Override
    public void turnLeft() {
        this.direction = Direction.LEFT;
    }

    @Override
    public void turnRight() {
        this.direction = Direction.RIGHT;
    }

    @Override
    public void goForward() {
        this.direction = Direction.STRAIGHT;
    }

    @Override
    public void goBack() {
        this.direction = Direction.BACKWARD;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "name='" + name + '\'' +
                ", prodYear=" + prodYear +

                ", direction=" + direction +
                '}';
    }
}

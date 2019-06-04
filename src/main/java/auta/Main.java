package auta;

import auta.interfaces.Moveable;
import auta.interfaces.Rentable;
import auta.objects.Car;
import auta.objects.Motorbike;
import auta.objects.RentableCar;

public class Main {

    public static void main(String[] args) {
        Rentable[] tab = new Rentable[3];
        tab[0] = new RentableCar("Mazda 6", 1998, 5);
        tab[1] = new RentableCar("Renault Clio", 2019, 4);
        tab[2] = new RentableCar("Kia Carens", 2017, 7);

        System.out.println(tab[0].isRent());
        tab[0].rent("wieslaw", "sztacheta", "1");
        System.out.println(tab[0].isRent());
        tab[0].handOver();
        System.out.println(tab[0].isRent());

        Moveable[] tab1 = new Moveable[3];
        tab1[0] = new Car("Peugeot", 2005, 5);
        tab1[1] = new Motorbike("Honda", 2011, 250);
        tab1[2] = new Motorbike("Kawasaki", 2019, 400);

        tab1[0].goBack();
        tab1[1].goForward();
        tab1[2].turnLeft();
        tab1[2].turnRight();
        System.out.println(tab1[0]);
        System.out.println(tab1[1]);
        System.out.println(tab1[2]);
    }
}

package auta;

import auta.objects.RentableCar;

public class Main {

    public static void main(String[] args) {
        RentableCar tab[] = new RentableCar[3];
        tab[0] = new RentableCar("Mazda 6", 1998, 5);
        tab[1] = new RentableCar("Renault Clio", 2019, 4);
        tab[2] = new RentableCar("Kia Carens", 2017, 7);

        System.out.println(tab[0].isRent());
        tab[0].rent("wieslaw", "sztacheta","1");
        System.out.println(tab[0].isRent());
        tab[0].handOver();
        System.out.println(tab[0].isRent());


    }
}

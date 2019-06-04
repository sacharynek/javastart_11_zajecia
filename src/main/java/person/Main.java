package person;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Address a1 = new Address("Suwałki", "16-400", "10a", "5b");
        Address a2 = new Address("Suwałki", "16-400", "10a", "5b");
        Address a3 = new Address("Warszawa", "00-000", "17", "6b");

        Person p1 = new Person("Edek", "Sztacheta", "888", 60, a3);
        Person p2 = new Person("Anna", "Mucha", "8865", 40, a2);
        Person p3 = new Person("Anna", "Mucha", "8865", 40, a1);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        System.out.println("p1 == p2 :" + p1.equals(p2));
        System.out.println("p1 == p3 :" + p1.equals(p3));
        System.out.println("p2 == p3 :" + p2.equals(p3));

        System.out.println("zacznij pisać :)");
        areTypedTextsEqual();
    }

    private static void areTypedTextsEqual() {
        Scanner sc = new Scanner(System.in);
        boolean flag = false;

        String text1, text2;
        text1 = sc.nextLine();
        while (!flag) {
            text2 = sc.nextLine();
            flag = text2.equals(text1);
            text1 = text2;
        }
    }
}

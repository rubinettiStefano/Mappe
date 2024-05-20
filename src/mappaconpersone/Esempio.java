package mappaconpersone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Esempio 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Person> idToPeople = new HashMap<>();

        idToPeople.put(1,  new Person(1, "John", "Doe"));
        idToPeople.put(3,  new Person(3, "Michael", "Johnson"));
        idToPeople.put(2,  new Person(2, "Jane", "Smith"));
        idToPeople.put(5,  new Person(5, "David", "Brown"));
        idToPeople.put(6,  new Person(6, "Emma", "Jones"));
        idToPeople.put(7,  new Person(7, "Daniel", "Garcia"));
        idToPeople.put(9,  new Person(9, "James", "Davis"));
        idToPeople.put(4,  new Person(4, "Emily", "Williams"));
        idToPeople.put(8,  new Person(8, "Sophia", "Martinez"));
        idToPeople.put(25, new Person(25, "Olivia", "Rodriguez"));

        System.out.println("Inserisci un id da 1 a 10");
        int id = Integer.parseInt(new Scanner(System.in).nextLine());

        Person res = idToPeople.get(id);

        System.out.println(res);
    }
}

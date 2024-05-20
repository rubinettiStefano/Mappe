package mappaconpersone;

import java.util.HashMap;

public class EsempioHash 
{
    public static void main(String[] args) 
    {
        HashMap<String,String> itaToEng = new HashMap<>();
        
        itaToEng.put("ciao", "hello");
        //1726 -> "hello"
        itaToEng.put("arrivederci", "bye");
        //129823 -> "bye"
        itaToEng.put("gatto", "cat");
        //27 -> "cat"
        itaToEng.put("matita", "pencil");
        //1935348 -> "pencil"

        //27 -> "cat"
        //1726 -> "hello"
        //129823 -> "bye"
        //1935348 -> "pencil"
        String value = itaToEng.get("ciao");
        //itaToEng.get(1726);
        //lo trova con un algoritmo di ricerca BINARIA
        //è un algoritmo che può funzionare SOLO se i dati sono ORDINATI

        HashMap<Person,String> personToNickname = new HashMap<>();

        personToNickname.put(new Person(1, "John", "Doe"),"Donjon");
        personToNickname.put(new Person(3, "Michael", "Johnson"),"Jackson ");
        personToNickname.put(new Person(2, "Jane", "Smith"),"Smitton");
        personToNickname.put(new Person(5, "David", "Brown"),"David");
        personToNickname.put(new Person(6, "Emma", "Jones"),"EMJ");
        personToNickname.put(new Person(7, "Daniel", "Garcia"),"Danga");
        personToNickname.put(new Person(9, "James", "Davis"),"Jamis");
        personToNickname.put(new Person(4, "Emily", "Williams"),"Willy");
        personToNickname.put(new Person(8, "Sophia", "Martinez"),"Sopez");
        personToNickname.put(new Person(25, "Olivia", "Rodriguez"),"Oliguez");

        Person p = new Person(9, "James", "Davis");

        System.out.println("Il suo soprannome è "+personToNickname.get(p));
    }
}

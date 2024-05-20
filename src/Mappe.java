import java.util.HashMap;

public class Mappe 
{
    public static void main(String[] args) 
    {
        //Creo una Mappa dove le chiavi sono String e i VALORI String
        //Mappa da String a String
        //utilizzo delle String per accedere ad altre String <String,String>
        //<String,String> Il primo è il tipo delle Chiavi, la seconda il tipo dei Valori
        HashMap<String,String> itaToEng = new HashMap<>();
        
        //Sto riempiendo la mappa
        //a differenza delle liste devo specificare 2 cose
        //chiave e valore ad esso collegato
        //la riga 18 si legge:
        //aggiungo alla mappa una coppia chiave-valore, con chiave "ciao" e valore "hello"
        itaToEng.put("ciao", "hello");
        itaToEng.put("arrivederci", "bye");
        itaToEng.put("gatto", "cat");
        itaToEng.put("matita", "pencil");

        //Possiamo accedere ai valori tramite la loro chiave
        //esattamente come nelle liste accediamo agli elementi tramite indice

        System.out.println("In inglese ciao si dice "+itaToEng.get("ciao"));

        //una lista è una Mappa dove le chiavi sono valori interi CONTIGUI, 0-1-2-3-ecc..
        //un Oggetto è una Mappa, dove i nomi delle proprietà sono le chiavi, i valori delle proprieta i valori

    }
}

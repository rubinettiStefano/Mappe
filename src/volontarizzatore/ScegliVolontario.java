package volontarizzatore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ScegliVolontario 
{
    public static void main(String[] args) 
    {
        HashMap<Integer,Volontario> volontari = new HashMap<>();

        volontari.put(1, new Volontario("Davide", "Spera",3));
        volontari.put(2, new Volontario("Alessio", "Nordio",3));
        volontari.put(3, new Volontario("Alfonso", "Niceforo",4));
        volontari.put(4, new Volontario("Alice", "Ibba",5));
        volontari.put(5, new Volontario("Andrea", "Paffi",2));
        volontari.put(6, new Volontario("Argel", "Alcantara",1));
        volontari.put(7, new Volontario("Cesare", "Malara",2));
        volontari.put(8, new Volontario("Claudia", "Amoruso",1));
        volontari.put(9, new Volontario("Eva", "Lopez",1));
        volontari.put(10, new Volontario("Federica", "Rocchetti",2));
        volontari.put(11, new Volontario("Francesca", "Guga",2));
        volontari.put(12, new Volontario("Francesco", "Amen",4));
        volontari.put(13, new Volontario("Gianluca", "Coccimiglio",3));
        volontari.put(14, new Volontario("Gianluca", "Gregori",3));
        volontari.put(15, new Volontario("Giuliano", "Cafolla",2));
        volontari.put(16, new Volontario("Lorenzo", "Giustozzi",1));
        volontari.put(17, new Volontario("Mattia", "Rosati",3));
        volontari.put(18, new Volontario("Andrea", "Porretta",5));
        volontari.put(19, new Volontario("Raffaele", "Cipolletta",3));
        volontari.put(20, new Volontario("Riccardo", "Crabbio",4));
        volontari.put(21, new Volontario("Santo", "Caldarella",4));
        volontari.put(22, new Volontario("Silvia", "Tancredi",1));

        int frequenzaMassimaAccettabile = (int)(1+ Math.random()*5); 
        //Math.random produce un numero tra 0 e 1 escluso
        //moltiplicandolo per 5 ottengo un numero tra 0 e 4.99999
        //+1 ottengo un numero tra 1 e 5.999999
        //quando converto a numero intero viene arrotondato per difetto, quindi 5.9999999999 diventa 5
        //risultato, numero intero casuale tra 1 e 5

        //Una Mappa è un insieme di COPPIE Chiave-valore, dove le chiavi non ammettono RIPETIZIONI

        //Il termine tecnico per UNA COPPIA CHIAVE-VALORE è ENTRY

        Set<Entry<Integer,Volontario>> entrySet = volontari.entrySet();

        ArrayList<Volontario> adatti = new ArrayList<>();
        //Entry<Integer,Volontario> -> 1, new Volontario("Davide", "Spera",3)
        for(Entry<Integer,Volontario> coppiaChiaveValore: entrySet)
        {
            Volontario v = coppiaChiaveValore.getValue();
            if(v.frequenzaOfferta<=frequenzaMassimaAccettabile)
                adatti.add(v);
        }

        Volontario scelto = adatti.get((int)(Math.random()*adatti.size()));

        System.out.println("La frequenza massima scelta è "+frequenzaMassimaAccettabile);
        System.out.println("Il \"volontario\" scelto è "+scelto.nome + " "+scelto.cognome+ ", aveva frequenza "+scelto.frequenzaOfferta);
    }
}
//Caso 2
//la lista adatti conterrà
// Andrea", "Paffi"
// Cesare", "Malara",
// Claudia", "Amoruso
// Eva", "Lopez
// Federica", "Rocchetti
// Giuliano", "Cafolla"
// Lorenzo", "Giustozzi
// Silvia", "Tancredi",
//size = 8


//1/8= 0,125

//Math.random da un numero tra:
//0     e 0,124 ->Andrea", "Paffi"           0   e 0,124 * 8 -> 0 e 0,99999  -> 0
//0,125 e 0,249 ->Cesare", "Malara"          0,125 e 0,249 * 8 -> 1 e 1,9999 -> 1
//0,251 e 0,375 ->Claudia", "Amoruso"
//0,376 e 0,500 ->Eva", "Lopez"
//0,501 e 0,625 ->Federica", "Rocchetti"
//0,626 e 0,750 ->Giuliano", "Cafolla"
//0,751 e 0,875 ->Lorenzo", "Giustozzi"
//0,876 e 0,999 ->Silvia", "Tancredi"



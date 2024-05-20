import java.util.Scanner;

public class Richiesta 
{
    public static void main(String[] args) 
    {
        //Chiedere all'utente in INGLESE di inserire la lingua del programma
        //ITA-una a vostra scelta
        
        //Leggere il file associato a quella lingua come ho fatto in Esempio
        
        //Chiedere all'utente di inserire una parola in inglese tra
        //fork
        //spoon
        //cup
        //door
        //dog

        //stampare la traduzione nella lingua scelta dall'utente di tale parola
        //se inserisce una parola diversa da quelle supportate stampare "IMPOSSIBILE TRADURRE"
        //nella lingua scelta dall'utente
        //se nelle mappe si fa mappa.get("chiaveNonEsistente") lui restituisce null
        Scanner term = new Scanner(System.in);
        System.out.println("Insert a language between ITA or FR");
        String language = term.nextLine().toLowerCase();

        LanguageReader lang;

        if(language.equalsIgnoreCase("ita"))
            lang = new LanguageReader("richiestaIta.txt");
        else
            lang = new LanguageReader("richiestaFr.txt");

        
        System.out.println("Insert the word to translate");
        String word = term.nextLine();


        String translation = lang.content.get(word);

        //se non abbiamo quella chiave traslation sarà null
        System.out.println(translation==null? lang.content.get("noTranslation"):translation);


    }
}

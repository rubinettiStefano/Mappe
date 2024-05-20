public class Esempio 
{
    public static void main(String[] args) 
    {
        LanguageReader lang = new LanguageReader("eng.txt");


        System.out.println(lang.content.get("presentation"));
        System.out.println(lang.content.get("happy_salute"));
        System.out.println(lang.content.get("termination"));
    }
}

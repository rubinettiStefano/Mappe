import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class LanguageReader 
{
    public HashMap<String,String> content = new HashMap<>();

    public LanguageReader(String filename)
    {
        try 
        {
            Scanner fileReader =  new Scanner(new File(filename));

            while(fileReader.hasNextLine())
            {
                String[] rowParts = fileReader.nextLine().split("=");
                content.put(rowParts[0], rowParts[1]);
            }

            fileReader.close();
        } 
        catch (FileNotFoundException e) 
        {
            e.printStackTrace();
        }
    }
}

import java.util.*;
import java.io.*;
public class LookUp
{
    static int frequency(String str) throws IOException
    {
        int count = 0;
        String[] words = null;
        String s;
        File file = new File("C:\\temp\\Data.txt"); //Creation of File Descriptor of the input

        FileReader reader = new FileReader(file); //Creation of File Reader object
        BufferedReader br = new BufferedReader(reader); //Creation of BufferedReader object
        while((s=br.readLine())!=null) //Reading Content from the file
        {
            words=s.split(" "); //Split the word using space
            for (String word : words)
            {
                if (word.equals(str)) //Search for the given word
                {
                    count++; //Incrementing count
                }
            }
        }
        reader.close();
        return count;
    }
}

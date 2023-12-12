import java.util.*;
import java.io.*;
import java.lang.*;

public class GetPass
    {
        String get_pass(String id)
        {
            String pass = null;
            try
            {
                File file = new File("C:\\temp\\Data.txt");
                Scanner reader = new Scanner(file);
                int i = 0;
                while (reader.hasNextLine())
                {
                    String str = reader.nextLine();
                    str.trim();
                    int x = str.indexOf(" ");
                    if (str.substring(0,x).equals(id))
                    {
                        pass = str.substring(x + 1, str.length());
                        break;
                    }
                }
            }
            catch (FileNotFoundException exception)
            {
                System.out.println("Unexcpected error occurred!");
            }
            return pass;
        }
    }


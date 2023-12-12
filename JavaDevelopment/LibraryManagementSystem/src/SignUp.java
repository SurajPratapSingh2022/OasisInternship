import java.util.*;
import java.lang.*;
import java.io.*;
public class SignUp
{
    static String name;
    static int age;
    static void beginSignUp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        name = sc.nextLine();
        System.out.println("Enter your age");
        age = sc.nextInt();
        SignUp ob = new SignUp();
        String id = ob.id_input();
        String pass = ob.pass_input();
        ob.write_credentials(id,pass);
    }
    void write_credentials(String id, String pass)
    {
        try
        {
            FileWriter fwrite = new FileWriter("C:\\temp\\Data.txt");
            fwrite.write(id+" "+pass);
            fwrite.close(); // Closing the stream
            System.out.println("Successfully Signed Up");
        } catch (IOException e)
        {
            System.out.println("Unexpected error occurred");
            e.printStackTrace();
        }
    }
    String id_input()
    {
        Scanner sc = new Scanner(System.in);
        SignUp ob = new SignUp();
        System.out.println("Enter a valid user id ,It will be required every time you log in \n Note:Only use alphanumeric characters");
                String id = sc.nextLine();
        boolean id_flag = check_id(id);
        if (id_flag != true)
        {
            id_input();
        }
        return id;
    }
    boolean check_id(String id)
    {
        int len = id.length();
        int c = 0;
        if (id.charAt(0) >= 'a' && id.charAt(0) <= 'z')
        {
            if(id.matches("[a-z0-9]+") && isUnique(id))
                return true;
            else
            {
                System.out.println("Invalid id");
                return false;
            }
        }
        else
        {
            System.out.println("Invalid id");
            return false;
        }
    }
    boolean isUnique(String id)
    {
        int freq = 0;
        try
        {
            LookUp ob1 = new LookUp();
            freq = ob1.frequency(id);
        }
        catch (Exception e)
        {
            System.out.println("IO Exception");
        }
        if (freq == 0)
            return true;
        else
            return false;
    }
    String pass_input()
    {
        Scanner sc = new Scanner(System.in);
        SignUp ob = new SignUp();
        System.out.println("Enter a valid password \n It will be required every time you log in");
                System.out.println("Only alpahanumeric characters are allowed with at least");
        System.out.println("One uppercase letter");
        System.out.println("One lowercase letter");
        System.out.println("and One number");
        String pass = sc.nextLine();
        boolean pass_flag = check_pass(pass);
        if (pass_flag != true)
        {
            pass_input();
        }
        return pass;
    }
    boolean check_pass(String pass)
    {
        int len = pass.length();
        int cu = 0, cn = 0, cl = 0;
        for(int i = 0; i < len; i++)
        {
            if (Character.isUpperCase(pass.charAt(i)))
                cu++;
            if (Character.isLowerCase(pass.charAt(i)))
                cl++;
            if (Character.isDigit(pass.charAt(i)))
                cn++;
        }
        if (cu > 0 && cn > 0 && cl > 0)
            return true;
        else
        {
            System.out.println("Invalid Password");
            return false;
        }
    }
}

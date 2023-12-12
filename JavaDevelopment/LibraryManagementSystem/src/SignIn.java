import java.util.*;
public class SignIn {

    static BooksAvail BA=new BooksAvail();
    static boolean input() {
        Scanner ob = new Scanner(System.in);
        System.out.println("\n\nEnter your ID");
        String id = ob.nextLine();
        String IssuerName = "x";
        System.out.println("Enter password: ");
        String pass = ob.nextLine();
        LookUp x = new LookUp();
        GetPass y = new GetPass();
        int id_freq = 0;
        try {
            id_freq = x.frequency(id);
        } catch (Exception e) {
            System.out.println("Unexpected error occurred!");
        }
        String password = y.get_pass(id);
        boolean truth = pass.equals(password);
        if (id_freq == 1 && truth) {
            System.out.println("Credentials Verified\n WELCOME!!!!");
            BA.BookAvail();
            return true;
        } else {
            System.out.println("Unable to verify the credentials");
            return false;
        }

    }
}


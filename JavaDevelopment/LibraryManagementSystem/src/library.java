import java.io.*;
import java.util.Scanner;

public class library {

    /*
     Create a library management system which is capable of issuing books to the students.
     Book should have info like:
     1. Book name
     2. Book Author
     3. Issued to
     User should be able to return issued books and issued books
     Admin will be able to add, remove ,edit the data base.
     Assume that all the users are registered with their names in the central database
      */


    public class head {
        public static void main(String[] args) throws IOException {

            Scanner sc = new Scanner(System.in);

            System.out.println("Welcome to the Library management System! , Please enter 1 for Existing User or 2 for New User and 3 for Admin:");


            int user_type = sc.nextInt();
            boolean flag1 = false, flag1x = false;
            SignIn ob1 = new SignIn();//for new users
            SignUp ob2 = new SignUp();//for existing users
            BooksAvail BA=new BooksAvail();//Book Issue/return/add
            if (user_type == 1) {
                while (flag1 == false) {
                    flag1 = ob1.input();

                }
            } else if (user_type == 2) {
                ob2.beginSignUp();
                System.out.println("\nKindly sign in with your credentials");
                while (flag1x == false) {
                    flag1x = ob1.input();
                    BA.BookAvail();
                }
            } else if (user_type == 3) {
                System.out.println("Please enter Admin Password:");
                int Password = sc.nextInt();

                if (Password == 12345) {
                    System.out.println("Welcome Sir, You can now add,delete edit the Library Management System");
                } else if (Password != 12345) {
                    System.out.println("Access Denied");
                }
            } else
                System.out.println("Invalid Choice");

        }
    }
    }


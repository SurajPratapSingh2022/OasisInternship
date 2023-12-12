import java.util.ArrayList;
import java.util.Scanner;

public class BooksAvail {
    class Book {
        //class for storing book name and author
        public String name, author;

        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        @Override
        public String toString() {
            return "Book{" +
                    "name='" + name + '\'' +
                    ", author='" + author + '\'' +
                    '}';
        }
    }

    class MyLibrary {
        public ArrayList<Book> books;

        public MyLibrary(ArrayList<Book> books) {
            this.books = books;
        }

        public void addBook(Book book) {
            System.out.println("The book has been added to the library");
            this.books.add(book);
        }

        public void issueBook(Book book, String issued_to) {
            System.out.println("The book has been issued from the library to " + issued_to);
            this.books.remove(book);
        }

        public void returnBook(Book b) {
            System.out.println("The book has been returned");
            this.books.add(b);
        }

    }

     void BookAvail() {
            Scanner sc=new Scanner(System.in);

            ArrayList<Book> bk = new ArrayList<>();
            Book b1 = new Book("Data Structures and Algorithms", "CLRS");
            bk.add(b1);

            Book b2 = new Book("Data Science", "Dhingra and Sen");
            bk.add(b2);

            Book b3 = new Book("Core Java Volume-1 Fundamentals", "Cay Hortsmann");
            bk.add(b3);

            Book b4 = new Book("Engineering Mathematics", "B.S Grewal");
            bk.add(b4);
            MyLibrary l = new MyLibrary(bk);
            //l.addBook(new Book("algo4", "myAuthor")); //for admin to add new books to database
            System.out.println("Available Books in Library:");
            System.out.println(l.books);
            System.out.println("Enter Name of book you wish to issue:");
            Book nameofbook=new Book(sc.next(), b1.author);
            l.issueBook(nameofbook, "Geetika");
            //System.out.println(l.books);

        }
    }


package librarymanagement.main;

import librarymanagement.library.Author;
import librarymanagement.library.Book;
import librarymanagement.library.IssueRecord;
import librarymanagement.library.Library;
import librarymanagement.member.Student;
import librarymanagement.staff.Librarian;

public class TestMain {

    public static void main(String[] args) {

        // ==============================
        // Create Student
        // ==============================

        Student s1 = new Student(
                101,
                "Debasree",
                "9876543210",
                "rahul@gmail.com",
                "IT",
                "Kolkata",
                "IT101",
                "2026IT001",
                5
        );

        System.out.println("Student Name: " + s1.getName());
        System.out.println("Department: " + s1.getDepartment());
        System.out.println("Roll No: " + s1.getRollno());
        System.out.println("Semester: " + s1.getSemester());


        // ==============================
        // Create Author
        // ==============================

        Author author1 = new Author(
                "A101",
                "James Gosling",
                "Programming"
        );

        System.out.println("\nAuthor Name: "
                + author1.getAuthorName());


        // ==============================
        // Create Book
        // ==============================

        Book book1 = new Book(
                101,
                "Java Programming",
                author1,
                "9781234567890",
                "ABC Publisher",
                "Programming",
                "5th",
                2024,
                "English",
                599.0,
                "Available"
        );

        System.out.println("Book Name: "
                + book1.getBookName());

        System.out.println("Book Price: "
                + book1.getPrice());

        System.out.println("Book Status: "
                + book1.getStatus());


        // ==============================
        // Create Library
        // ==============================

        Library library = new Library(
                1,
                "Central Library",
                "Kolkata",
                "9876543210"
        );


        // ==============================
        // Add Book to Library
        // ==============================

        library.addBook(book1);

        System.out.println("\nBook added to library.");


        // ==============================
        // Create Issue Record
        // ==============================

        IssueRecord record1 = new IssueRecord(
                1,
                book1,
                s1,
                "03-10-2026",
                "17-10-2026",
                ""
        );

        library.addIssueRecord(record1);


        // ==============================
        // Display Issue Record
        // ==============================

        System.out.println("\n----- Issue Record -----");

        System.out.println("Issue ID: "
                + record1.getIssueID());

        System.out.println("Book: "
                + record1.getBook().getBookName());

        System.out.println("Member: "
                + record1.getMember().getName());

        System.out.println("Issue Date: "
                + record1.getIssueDate());

        System.out.println("Due Date: "
                + record1.getDueDate());


        // ==============================
        // Create Librarian
        // ==============================

        Librarian librarian = new Librarian(
                201,
                "Sourav",
                "9876543210",
                "Librarian",
                "Morning"
        );


        // ==============================
        // Issue Book
        // ==============================

        System.out.println("\n----- Issue Book -----");

        librarian.issueBook(library, 101);

        System.out.println("Book Status: "
                + book1.getStatus());


        // ==============================
        // Find Book
        // ==============================

        System.out.println("\n----- Find Book -----");

        Book foundBook = library.findBook(101);

        if (foundBook != null) {

            System.out.println("Book found: "
                    + foundBook.getBookName());

        } else {

            System.out.println("Book not found.");
        }


        // ==============================
        // Display All Books
        // ==============================

        System.out.println("\n----- Books in Library -----");

        library.displayBooks();


        // ==============================
        // Receive Book
        // ==============================

        System.out.println("\n----- Receive Book -----");

        librarian.receiveBook(library, 101);

        System.out.println("Book Status: "
                + book1.getStatus());
    }
}
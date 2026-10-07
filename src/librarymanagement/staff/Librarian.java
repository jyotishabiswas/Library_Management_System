package librarymanagement.staff;

import librarymanagement.library.Book;
import librarymanagement.library.Library;

public class Librarian extends Staff {

    private String shift;

    // Constructor
    public Librarian(int staffID, String name,
                     String contactNo, String designation,
                     String shift) {

        super(staffID, name, contactNo, designation);
        this.shift = shift;
    }

    // Getter and Setter

    public String getShift() {
        return shift;
    }

    public void setShift(String shift) {
        this.shift = shift;
    }

    // Issue Book
    public void issueBook(Library library, int bookID) {

        Book book = library.findBook(bookID);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.getStatus().equals("Available")) {

            book.setStatus("Issued");
            System.out.println("Book issued successfully.");

        } else {

            System.out.println("Book is not available.");
        }
    }

    // Receive Book
    public void receiveBook(Library library, int bookID) {

        Book book = library.findBook(bookID);

        if (book == null) {
            System.out.println("Book not found.");
            return;
        }

        if (book.getStatus().equals("Issued")) {

            book.setStatus("Available");
            System.out.println("Book received successfully.");

        } else {

            System.out.println("Book is not currently issued.");
        }
    }
}
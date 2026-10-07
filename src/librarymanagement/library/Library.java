package librarymanagement.library;

import java.util.ArrayList;

public class Library {

    private int libraryID;
    private String libraryName;
    private String libraryAddress;
    private String contactNo;

    private ArrayList<Book> books;
    private ArrayList<IssueRecord> issueRecords;

    // Constructor
    public Library(int libraryID, String libraryName,
                   String libraryAddress, String contactNo) {

        this.libraryID = libraryID;
        this.libraryName = libraryName;
        this.libraryAddress = libraryAddress;
        this.contactNo = contactNo;

        books = new ArrayList<Book>();
        issueRecords = new ArrayList<IssueRecord>();
    }

    // Add Book
    public void addBook(Book book) {
        books.add(book);
    }

    // Remove Book
    public void removeBook(Book book) {
        books.remove(book);
    }

    // Get all books
    public ArrayList<Book> getBooks() {
        return books;
    }

    // Display books
    public void displayBooks() {

        for (Book book : books) {
            System.out.println(book.getBookName());
        }
    }

    // Find book by ID
    public Book findBook(int bookID) {

        for (Book book : books) {

            if (book.getBookID() == bookID) {
                return book;
            }
        }

        return null;
    }

    // Add Issue Record
    public void addIssueRecord(IssueRecord record) {
        issueRecords.add(record);
    }

    // Get Issue Records
    public ArrayList<IssueRecord> getIssueRecords() {
        return issueRecords;
    }

    // Find Issue Record
    public IssueRecord findIssueRecord(int issueID) {

        for (IssueRecord record : issueRecords) {

            if (record.getIssueID() == issueID) {
                return record;
            }
        }

        return null;
    }

    // Getters and Setters

    public int getLibraryID() {
        return libraryID;
    }

    public void setLibraryID(int libraryID) {
        this.libraryID = libraryID;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public String getLibraryAddress() {
        return libraryAddress;
    }

    public void setLibraryAddress(String libraryAddress) {
        this.libraryAddress = libraryAddress;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}
package librarymanagement.library;

public class Author {

    private String authorCode;
    private String authorName;
    private String specialization;

    // Constructor
    public Author(String authorCode, String authorName, String specialization) {
        this.authorCode = authorCode;
        this.authorName = authorName;
        this.specialization = specialization;
    }

    // Getters and Setters
    public String getAuthorCode() {
        return authorCode;
    }

    public void setAuthorCode(String authorCode) {
        this.authorCode = authorCode;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
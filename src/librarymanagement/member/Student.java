package librarymanagement.member;

public class Student extends Member {

    private String rollno;
    private String registrationno;
    private int semester;

    // Constructor
    public Student(int memberID, String name, String contact,
                   String email, String department, String address,
                   String rollno, String registrationno, int semester) {

        super(memberID, name, contact, email, department, address);

        this.rollno = rollno;
        this.registrationno = registrationno;
        this.semester = semester;
    }

    // Getters and Setters

    public String getRollno() {
        return rollno;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }

    public String getRegistrationno() {
        return registrationno;
    }

    public void setRegistrationno(String registrationno) {
        this.registrationno = registrationno;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }
}
package librarymanagement.member;

public class Teacher extends Member {

    private String employeeID;
    private String designation;

    // Constructor
    public Teacher(int memberID, String name, String contact,
                   String email, String department, String address,
                   String employeeID, String designation) {

        super(memberID, name, contact, email, department, address);

        this.employeeID = employeeID;
        this.designation = designation;
    }

    // Getters and Setters

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
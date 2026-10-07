package librarymanagement.staff;

public class Staff {

    private int staffID;
    private String name;
    private String contactNo;
    private String designation;

    // Constructor
    public Staff(int staffID, String name,
                 String contactNo, String designation) {

        this.staffID = staffID;
        this.name = name;
        this.contactNo = contactNo;
        this.designation = designation;
    }

    // Getters and Setters

    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }
}
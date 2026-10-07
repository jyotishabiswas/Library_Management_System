package librarymanagement.member;

public class Member {

    private int memberID;
    private String name;
    private String contact;
    private String email;
    private String department;
    private String address;

    // Constructor
    public Member(int memberID, String name, String contact,
                  String email, String department, String address) {

        this.memberID = memberID;
        this.name = name;
        this.contact = contact;
        this.email = email;
        this.department = department;
        this.address = address;
    }

    // Getters and Setters

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
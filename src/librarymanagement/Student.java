package librarymanagement;

public class Student extends Person 
{
	private String department;

    public Student(int id, String name, String department) 
    {
        super(id, name);
        this.department = department;
    }

    @Override
    public void showRole() 
    {
        System.out.println("Student: " + getName());
        System.out.println("Department: " + department);
    }

    public String getDepartment() 
    {
        return department;
    }
}
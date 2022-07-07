package chapter07;

public class employeeclass {
    int idNumber;
    String name;
    String department;
    String position;
    
    
    public employeeclass(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
	public employeeclass(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		position = department = "";
	}
    public employeeclass() {
    	name = department = position = "";
    	idNumber = 0;
    }
    public void setName(String name) {
    	this.name = name;
    }
    public String getName() {
    	return this.name;
    }
    public void setIdNumber(int idNumber) {
    	this.idNumber = idNumber;
    	
    }
    public int getIdNumber() {
        return this.idNumber;
    }
    public void setDepartment(String department) {
    	this.department = department;
    }
    public String getDepartment() {
    	return this.department;
    }
    public void setPosition(String position) {
    	this.position = position;
    }
    public String getposition() {
    	return this.position;
	}
    public static void main(String[] args) {
        employeeclass emp = new employeeclass("Susan Meyers",47899,"Accounting","Vice President");
        employeeclass emp1 = new employeeclass("Mark Jones",39119,"IT","Programmer");
        employeeclass emp2 = new employeeclass("Joy Rogers",81774,"Manufacturing","Engineer");
        System.out.printf("%-20s%-20s%-20s%-20s\n","Name","ID Number","Department","Position");
        System.out.printf("%-20s%-20s%-20s%-20s\n","Name","ID Number","Department","Position");
        System.out.printf("%-20s%-20d%-20s%-20s\n",emp.getName(),emp.getIdNumber(),emp.getDepartment(),emp.getposition());
        System.out.printf("%-20s%-20d%-20s%-20s\n",emp1.getName(),emp1.getIdNumber(),emp1.getDepartment(),emp1.getposition());
        System.out.printf("%-20s%-20d%-20s%-20s\n",emp2.getName(),emp2.getIdNumber(),emp2.getDepartment(),emp2.getposition());
   }
}

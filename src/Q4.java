import java.util.Scanner;

class Employee{
	int empId;
	String empName;
	double salary;
	public Employee(int empId, String empName, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	

//public class Q4 {
//
//	public static void main(String[] args) {
//		Employee e1=new Employee(10,"ramesh",500);
//		Employee e2=new Employee(11,"amesh",1500);
//		Employee e3=new Employee(12,"mesh",2500);
//		Employee e4=new Employee(13,"esh",3500);
//		Employee arr[]=new Employee[4];
//		int id;
//		System.out.println("enter the id of emp to be searched");
//		Scanner s=new Scanner(System.in);
//		int id=s.nextInt();
//		for(Employee val:arr) {
//			if(val.getEmpId()==id) {
//				
//			}
//		}
		
		
		
		// TODO Auto-generated method stub

	}

}
//Create array of employees and search employee by i. empid ii. name ii
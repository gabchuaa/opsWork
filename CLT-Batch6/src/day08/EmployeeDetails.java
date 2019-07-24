package day08;

public class EmployeeDetails implements MyPrototype {

	int empID;
	String empName;
	String destination;
	
	public void setDestination(String destination) {
		this.destination = destination;
	}
	
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

		@Override
	public MyPrototype clone() throws CloneNotSupportedException{
	System.out.println("\nCloning MyProtoType Object");
		return (MyPrototype)super.clone();
	}//end of clone
	
	
	
	void showRecord() {
		System.out.println("\n Employee ID\tEmployee Name\tEmployee Designation");
		System.out.println("====================================================");
		System.out.println(empID+ "\t\t" +empName +"\t\t" + destination);
	}//end of showRecord()
	

	
	
}

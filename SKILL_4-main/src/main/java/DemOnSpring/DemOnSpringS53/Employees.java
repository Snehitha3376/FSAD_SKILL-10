package DemOnSpring.DemOnSpringS53;

import java.util.List;

public class Employees {
	int empID;
	String empName;
	double empSalary;
	boolean empActive;
List<String> empList;
public int getEmpID() {
	return empID;
}
public void setEmpID(int empID) {
	this.empID = empID;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public double getEmpSalary() {
	return empSalary;
}
public void setEmpSalary(double empSalary) {
	this.empSalary = empSalary;
}
public boolean isEmpActive() {
	return empActive;
}
public void setEmpActive(boolean empActive) {
	this.empActive = empActive;
}
public List<String> getEmpList() {
	return empList;
}
public void setEmpList(List<String> empList) {
	this.empList = empList;
}
@Override
public String toString() {
	return "Employees ID=" + empID + "\n"+
           "Employees Name=" + empName + "\n"+
		   "Employees Salary=" + empSalary + "\n"+
           "Employees Active="+ empActive + "\n"+
           "Employees List=" + empList ;
}


	
	
	
	
	

}

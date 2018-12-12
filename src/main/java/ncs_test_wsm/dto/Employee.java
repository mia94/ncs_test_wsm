package ncs_test_wsm.dto;

public class Employee {
	private int empno;
	private String empname;
	private Title title;
	private int salary;
	private Department dno;
	private Employee manager;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public Title getTitle() {
		return title;
	}
	public void setTitle(Title title) {
		this.title = title;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Department getDno() {
		return dno;
	}
	public void setDno(Department dno) {
		this.dno = dno;
	}
	public Employee getManager() {
		return manager;
	}
	public void setManager(Employee manager) {
		this.manager = manager;
	}
	
	@Override
	public String toString() {
		return String.format("Employee [%s, %s, %s, %s, %s, %s]", empno, empname, title, salary, dno, manager);
	}
	
	
}

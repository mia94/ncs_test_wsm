package ncs_test_wsm.dto;

public class Department {
	private int deptno;
	private String deptname;
	private int floor;
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	@Override
	public String toString() {
		return String.format("Department [%s, %s, %s]", deptno, deptname, floor);
	}
	
	
}

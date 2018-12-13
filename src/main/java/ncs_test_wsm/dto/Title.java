package ncs_test_wsm.dto;

public class Title {
	private int no;
	private String name;
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String titleName) {
		this.name = titleName;
	}
	
	@Override
	public String toString() {
		return String.format("Title [%s, %s]", no, name);
	}
	
	
}

package springmaster.bean;

public class Employee {
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	private String name;
	private String dept;
	private Address address;
	
	public Employee (int id,String name,String dept,Address address) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.address = address;
	}
	
	public String info() {
		return "Id - "+this.id+" Name - "+this.name +" Department :"+this.dept +"Address " +this.address.DisplayAddress();
	}
	

}

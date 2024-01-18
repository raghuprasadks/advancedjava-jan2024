package springmaster.bean;

public class Product {
	
	private int code;
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	public String toString() {
		return "Code :"+this.code +" Name "+this.name;
	}
	
	

}

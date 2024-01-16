package collectionsdemo;

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

	public String getSupplier() {
		return supplier;
	}

	public void setSupplier(String supplier) {
		this.supplier = supplier;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	private String name;
	private String supplier;
	private int price;
	
	public Product(int code,String name,String supplier,int price) {
		this.code = code;
		this.name = name;
		this.supplier = supplier;
		this.price = price;
	}
	
	public String toString() {
		return "Code : "+this.code + " Name : "+this.name +"Supplier "+this.supplier +" Price "+this.price;
	}

}

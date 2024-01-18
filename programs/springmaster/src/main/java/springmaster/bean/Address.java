package springmaster.bean;

public class Address {
	private int housenum;
	public int getHousenum() {
		return housenum;
	}

	public void setHousenum(int housenum) {
		this.housenum = housenum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String street;
	private String location;
	
	public Address(int housenum,String street,String location) {
		this.housenum=housenum;
		this.street=street;
		this.location = location;
	}
	
	public String DisplayAddress () {
		String address = String.format("Address - House Number : %d - Street - %s - Location :  %s ",this.getHousenum(),this.getStreet(),this.getLocation());
		return address;
		
	}
	

}

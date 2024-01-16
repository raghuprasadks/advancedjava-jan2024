package collectionsdemo;

public class Account {
	private int actnum;
	private String name;
	private String bank;
	private int balance;
	
	public Account(int actnum,String name,String bank,int balance) {
		this.actnum=actnum;
		this.name = name;
		this.bank = bank;
		this.balance = balance;
	}
	
	public String toString() {
		return "Act Number "+this.actnum +" Name : "+this.name +" Bank "+this.bank +" Balance "+this.balance;
	}

}

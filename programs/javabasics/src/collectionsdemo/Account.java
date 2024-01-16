package collectionsdemo;

public class Account {
	private int actnum;
	public int getActnum() {
		return actnum;
	}

	public void setActnum(int actnum) {
		this.actnum = actnum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

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

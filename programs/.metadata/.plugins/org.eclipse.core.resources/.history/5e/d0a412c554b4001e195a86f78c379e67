package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class AccountManagement {
	
	private List<Account> accountList = new ArrayList<Account>();

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Account Creation");
		AccountManagement actmgmt = new AccountManagement();
		actmgmt.createaccount(1, "ravi", "icici", 0);
		actmgmt.createaccount(2, "gagana", "sbi", 0);	

	}
	
	public int createaccount(int actnum,String name,String bank,int balance) {
		Account account = new Account(actnum,name,bank,balance);
		accountList.add(account);
		return actnum;
	}
}

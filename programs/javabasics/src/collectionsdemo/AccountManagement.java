package collectionsdemo;

import java.util.ArrayList;
import java.util.List;

public class AccountManagement {	
	private List<Account> accountList = new ArrayList<Account>();
	
	public static void main(String[] args) {
		System.out.println("Account Creation");
		int balance=0;
		AccountManagement actmgmt = new AccountManagement();
		actmgmt.createaccount(1, "ravi", "icici", 0);
		actmgmt.createaccount(2, "gagana", "sbi", 0);
		balance= actmgmt.deposit(1, 10000);
		System.out.println("Balance in account with number 1 is "+balance);
		balance= actmgmt.deposit(1, 20000);
		System.out.println("Balance in account with number 1 is "+balance);		
	}
	
	public int createaccount(int actnum,String name,String bank,int balance) {
		Account account = new Account(actnum,name,bank,balance);
		accountList.add(account);
		return actnum;
	}	
	public int deposit(int actnum,int amttodeposit) {
		int balance=-1;
		boolean isFound=false;
		for(Account act:accountList) {
			if (act.getActnum()==actnum) {
				act.setBalance(act.getBalance()+amttodeposit);
				balance= act.getBalance();	
				isFound=true;
			}
		}
		if (isFound !=true) {
			System.out.println("Account Number "+actnum +" not found");
		}
		return balance;
	}
	
	public int withdraw(int actnum,int amttowithdraw) {
		int balance=-1;
		boolean isFound=false;
		for(Account act:accountList) {
			if (act.getActnum()==actnum) {
				isFound=true;
				if(act.getBalance()>amttowithdraw) {
					act.setBalance(act.getBalance()-amttowithdraw);
					balance= act.getBalance();	
				}else {
					System.out.println("You donot have enough balance");
				}				
			}
		}
		if (isFound !=true) {
			System.out.println("Account Number "+actnum +" not found");
		}
		return balance;
	}
}
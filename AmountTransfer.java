//find the amount to be transfered from one account to another account
package simple;

import java.util.Scanner;

public class AmountTransfer {
	public static void main(String[] args) {
		Scanner account = new Scanner(System.in);
		System.out.println("enter source and target account number");
		int sa = account.nextInt();
		int ta = account.nextInt();
		System.out.println("enter the amount you want ")
		int amount = account.nextInt();
		int sab = 6000,tab = 3000;
		if(amount<=sa)
		{
		  tab = tab+ta;
		  sab = sab-amount;
		  System.out.println("An amount of "+amount+"is tranfered from"+sa+"to"+ta);	
		}
		else
		{
			System.out.println("insufficient balance");
		}

	}
}



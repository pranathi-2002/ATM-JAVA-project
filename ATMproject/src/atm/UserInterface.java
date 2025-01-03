package atm;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		 ATMoperationimp impl=new  ATMoperationimp();
		Scanner sc=new Scanner(System.in);
		int atmnumber=123456;
		int atmpin=123;
		System.out.println("welcome to atm machine");
		System.out.println("enter the atm number");
		int atmnum2=sc.nextInt();
		System.out.println("enter the atm pin");
		int atmpin2=sc.nextInt();
		if(atmnumber==atmnum2&& atmpin==atmpin2) {
			while(true) {
			System.out.println("1.viewAvailable\n 2.withdrawAmount\n 3.depositAmount\n 4.viewminstatement\n 5.Exit");
		System.out.println("enter your choice");
		int ch=sc.nextInt();
		if(ch==1) {
			impl.viewbalance();
		}else if(ch==2) {
			System.out.println("enter the amount to withdrawAmount");
			double withdrawAmount=sc.nextDouble();
			impl.withdrawAmount(withdrawAmount);
		}else if(ch==3) {
			System.out.println("enter the amount deposit");
			double depositAmount=sc.nextDouble();
			impl.depositAmount(depositAmount);
		}else if(ch==4) {
			impl.viewminsatement();
		}else if(ch==5) {
			System.out.println("collect your atm card\n thank you");
			System.exit(ch);
		}
			}
		}else {
			System.out.println("incorrect atm number or pin");
		}
	}

}

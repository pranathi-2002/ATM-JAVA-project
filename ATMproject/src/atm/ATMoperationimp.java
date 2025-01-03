package atm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ATMoperationimp implements ATMInterface {

ATM atm=new ATM();
Map<Double,String>minstatement=new HashMap<>();

	public void viewbalance() {
		System.out.println("Available balance"+atm.getBalance());
		
	}

	
	public void withdrawAmount(double withdrawAmount) {
		if(withdrawAmount%500==0) {
			if(withdrawAmount<=atm.getBalance()) {
				System.out.println("collect the cash:"+withdrawAmount);
				atm.setBalance(atm.getBalance()-withdrawAmount);
				minstatement.put(withdrawAmount, "Amount withdrawn");
				viewbalance();
			}else {
				System.out.println("insufficient balance");
			}
		}else {
			System.out.println("enter the amount in terms of 500");
		}
		
	}

	
	public void depositAmount(double depositAmount) {
		System.out.println("depositAmount is::"+depositAmount);
		atm.setBalance(atm.getBalance()+depositAmount);
		minstatement.put(depositAmount,"Deposit successfully");
		viewbalance();
	}

	
	public void viewminsatement() {
	Set<Double> set	=minstatement.keySet();
	for(Double d:set) {
		System.out.println(d+"="+minstatement.get(d));
	}
		
	}

}

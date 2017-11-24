import FormatIO.*;

public class vEx1 {
	
	public static void main (String[] arg) 
	{
		Console con = new Console();
		
		String accNoReq = "";
		String initBalReq = "";
		int initBal = 0;
		String transReq = "";
		int userTrans = 0;
		int updatedBal = 0;
		String accNo = "";
						
		accNoReq = "Please enter your current account number:";
		acc2NoReq = "Please enter your savings account number:";
		initBalReq = "Please enter your initial current account balance:";
		initBal2Req =  "Please enter your initial savings account balance:";
		transReq = "Please enter the transaction you wish to make (withdrawals should be preceded by -";
		
		con.println(accNoReq);
		String accNo1 = String.format("%8s");
		accNo = con.readLine();
		
		boolean accYes1 = accNo.equals(accNo1);
		boolean accYes2 = initBal > 0;
		
		if (accYes1 && accYes2) = true {
		
			con.println(acc2NoReq);	
			con.readLine();
		}
		
		
		con.println(accNoReq);
		accNo = con.readLine();
		
		con.println(initBalReq);
		initBal = con.readInt();
				
		con.println(transReq);
		userTrans = con.readInt();
		
		updatedBal = initBal + userTrans;
				
		String statement1 = String.format("Account no. %s\nDeposit:%d\nCurrent balance:%d",accNo, userTrans, updatedBal);
		String statement2 = String.format("Account no. %s\nWithdrawal:%d\nCurrent balance:%d",accNo, userTrans, updatedBal);
		String bankFile = String.format("Account no. %s\nInitial acc balance: %d\nCurrent balance: %d", accNo,  initBal, updatedBal);
		
		FileOut fout = new FileOut("Bank Account");
		fout.println(bankFile);
		
					
		if (userTrans > 0) {
					
			con.println(statement1);
		}
		
		else 
			
			con.println(statement2);			
		
			
		
		
	}		
		
}
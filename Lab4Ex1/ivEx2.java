import FormatIO.*;

public class ivEx2 {
	
	public static void main (String[] arg) 
	{
		Console con = new Console();
		
		String accNoReq = "";
		String initBalReq = "";
		String accNo = "";
		int initBal = 0;
		String transReq = "";
		int userTrans = 0;
		int updatedBal = 0;
						
		accNoReq = "Please enter your account number:";
		initBalReq = "Please enter your initial account balance:";
		transReq = "Please enter the transaction you wish to make (withdrawals should be preceded by -";
		
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


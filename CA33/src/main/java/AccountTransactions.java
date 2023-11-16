import java.util.ArrayList;

public class AccountTransactions extends CustomerAccount {
   protected String transactiondate;
		   protected String transactiontype;
		   protected double transactionamount;
		   
   
   public AccountTransactions() {
	   
	   super();
	   this.transactiondate = "";
	   this.transactiontype = "";
	   this.transactionamount = 0;
   }
   public static ArrayList<AccountTransactions> transactions = new ArrayList<>();
   
   public AccountTransactions(double customerbalance, String customeraccountnumber, String transactiondate, String transactiontype, double transactionamount) 
   {
	   
	   super(customerbalance,customeraccountnumber);
	   
	   this.transactiondate = transactiondate;
	   this.transactiontype = transactiontype;
	   this.transactionamount = transactionamount;
	   
	   
   }
   
   public static AccountTransactions findAccount (String customeraccountnumber) {
	    AccountTransactions foundAccount = null;
	    for (AccountTransactions acc : transactions) {
	        if (acc.getCustomerAccount().contentEquals(customeraccountnumber)) {
	       
	        	foundAccount = acc;
	        }
	    }

	    return foundAccount;

	}
   
   
   public static AccountTransactions accountexists (String customeraccountnumber) {
	    AccountTransactions foundAcc = null;
	    for (AccountTransactions acc : transactions) {
	        if (acc.getCustomerAccount().equals(customeraccountnumber)) {
	       
	        	foundAcc = acc;
	        }
	    }

	    return foundAcc;

	}
   
    public static AccountTransactions findTrasactions (String transactiontype) {
	    AccountTransactions foundTransactions = null;
	    for (AccountTransactions acc : transactions) {
	        if (acc.getTransactionType().contentEquals(transactiontype)) {
	       
	        	foundTransactions = acc;
	        }
	    }

	    return foundTransactions;

	}
   
   public String getTransactionDate() {
   	
   	return this.transactiondate;
   }
   
   public String getTransactionType() {
	   	
	   	return this.transactiontype;
	   }
   
   public double getTransactionAmount() {
	   	
	   	return this.transactionamount;
	   }
   
   public void setTransactionDate(String td) {
   	
   	this.transactiondate = td;
   	
   }
   
   public void setTransactionType(String tt) {
	   	
	   	this.transactiontype = tt;
	   	
	   }
   
   public void setTransactionAmount(double a) {
	   	
	   	this.transactionamount = a;
	   	
	   }
   
   
   
   
   
}

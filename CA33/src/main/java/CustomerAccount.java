import java.util.ArrayList;

public class CustomerAccount {
   protected double customerbalance;
   protected String customeraccountnumber;
   
   public CustomerAccount() {
	   
	  
	   this.customerbalance = 0.00;
	   this.customeraccountnumber = "";
	   
   }
 
   
   public CustomerAccount(double customerbalance , String customeraccountnumber) 
   {
	   
	   this.customerbalance = customerbalance;
	   this.customeraccountnumber = customeraccountnumber;
	   
	   
   }
   
   public double getCustomerBalance() {
   	
   	return this.customerbalance;
   }
   public String getCustomerAccount() {
	   	
	   	return this.customeraccountnumber;
	   }
   
   
   public void setcustomerBalance(double cb) {
   	
   	this.customerbalance = cb;
   	
   }
   
   public void setcustomerAccount(String ca) {
	   	
	   	this.customeraccountnumber = ca;
	   	
	   }
   
   
   
   
   
   
}

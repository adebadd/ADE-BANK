
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Abdul Badmos
 */
public class Customer {

    protected String customerfirst;
    protected String customerlast;
    protected String customerpass;
    protected String customerID;
    protected String customerPPSN;
    protected String customerDOB;
    protected String accountnum;


    public Customer() {
        this.customerfirst = "";
        this.customerlast = "";
        this.customerpass = "";
        this.customerID = "";
        this.customerPPSN = "";
        this.customerDOB = "";
        this.accountnum = "";

    }   

    public static ArrayList<Customer> customers = new ArrayList<Customer>();

    public static boolean customerexists(String customerpass, String customerID) {
        
        for (Customer customer : customers) {
            if (customer.getCustomerID().contentEquals(customerID) && customer.getCustomerPass().contentEquals(customerpass)) {

                return true;
            }
        }

        return false;

    }
    
public static boolean customerexists2(String customerDOB, String customerpass ) {
        
        for (Customer customer : customers) {
            if (customer.getCustomerDOB().contentEquals(customerDOB) && customer.getCustomerPass().contentEquals(customerpass)) {

                return true;
            }
        }

        return false;

    }

public static boolean customerexists3(String accountnum) {
        
        for (Customer customer : customers) {
            if (customer.getAccountNum().contentEquals(accountnum)) {

                return true;
            }
        }

        return false;

    }

public static Customer findCustomer (String customerDOB, String customerpass) {
    Customer foundCustomer = null;
    for (Customer customer : customers) {
        if (customer.getCustomerDOB().contentEquals(customerDOB) && customer.getCustomerPass().contentEquals(customerpass)) {
       
        	foundCustomer = customer;
        }
    }

    return foundCustomer;

}

public static Customer findCustomerAccountNum (String accountnum) {
    Customer foundCustomerAccountNum = null;
    for (Customer customer : customers) {
        if (customer.getAccountNum().contentEquals(accountnum)) {
       
        	foundCustomerAccountNum = customer;
        }
    }

    return foundCustomerAccountNum;

}



    public Customer(String customerfirst, String customerlast, String customerpass, String customerID, String customerPPSN, String customerDOB, String accountnum) {
        this.customerfirst = customerfirst;
        this.customerlast = customerlast;
        this.customerpass = customerpass;
        this.customerID = customerID;
        this.customerPPSN = customerPPSN;
        this.customerDOB = customerDOB;
        this.accountnum = accountnum;
       
    }

    public String getCustomerFirst() {
        return this.customerfirst;
    }

    public String getCustomerLast() {
        return this.customerlast;
    }

    public String getCustomerPass() {
        return this.customerpass;
    }

    public String getCustomerID() {
        return this.customerID;
    }

    public String getCustomerPPSN() {
        return this.customerPPSN;
    }

    public String getCustomerDOB() {
        return this.customerDOB;
    }
    
    public String getAccountNum() {
        return this.accountnum;
    }
    
  

    public void setcustomerFirst(String cf) {
        this.customerfirst = cf;
    }

    public void setcustomerLast(String cl) {
        this.customerlast = cl;
    }

    public void setcustomerPass(String cp) {
        this.customerpass = cp;
    }

    public void setcustomerID(String ci) {
        this.customerID = ci;
    }

    public void setcustomerPPSN(String cpp) {
        this.customerPPSN = cpp;
    }

    public void setcustomerDOB(String dob) {
        this.customerDOB = dob;
    }
    
    public void setaccountNum(String an) {
        this.accountnum = an;
    }
    
   

}

import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Admin data class
 */
public class Administator {
    
	private String adminusername;
	private String adminpass;

	public static ArrayList<Administator> listofAdmins = new ArrayList<Administator>();
	
	 public static boolean adminexists(String adminusername, String adminpass) {
	        
	        for (Administator admin : listofAdmins) {
	            if (admin.getAdminUsername().contentEquals(adminusername) && admin.getAdminPass().contentEquals(adminpass)) {

	                return true;
	            }
	        }

	        return false;

	    }
	
	public Administator() {
	this.adminusername = "";
	this.adminpass ="";

	}

	public Administator (String adminusername, String adminpass) {
		this.adminusername = adminusername;
		this.adminpass = adminpass;	
	}

	public String getAdminUsername() {
		return this.adminusername;
	}

	public String getAdminPass() {
		return this.adminpass;
	}



	public void setAdminUsername(String au) {
		this.adminusername = au;
	}

	public void setAdminPass(String ap) {
		this.adminpass = ap;
	}




}


public class Manager  extends Employe {

	
	private String dep_name;
	private int basic;
	
	
	
	public Manager(String name, String empid, String ph_no, String email) {
		super(name, empid, ph_no, email);
		
		dep_name="Manager";
		basic=60000;
	}
	




public void show(){
	System.out.println("Show the Manager details:");
	  System.out.println("POST:"+dep_name);
	
}

public void calculateSalary(){
	double TravelAllowance=0.15*basic;
	double TotalSalary=basic+TravelAllowance;
	System.out.println("Total Salary of the Manager is :"+TotalSalary);

}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

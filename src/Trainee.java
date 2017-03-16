
public class Trainee extends Employe {


private String dep_name;
	private int basic;
	
	public Trainee(String name, String empid, String ph_no, String email) {
		super(name, empid, ph_no, email);
		
		dep_name="Trainee";
		basic=40000;
	
	}
	
	
	public void show(){
		System.out.println("Show the Trainee details:");
		  System.out.println("POST:"+dep_name);
		
	}
	
	public void calculateSalary(){
		double TravelAllowance=0.10*basic;
		double TotalSalary=basic+TravelAllowance;
		System.out.println("Total Salary of the Manager is :"+TotalSalary);}

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

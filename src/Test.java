
public class Test {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employe m=new Manager("papan","223","7427925979","papan003@gmail.com");
		
		m.show();
		System.out.println("NAME :"+m.Empname);
		System.out.println("EMPLOYEE ID :"+m.Empid);
		System.out.println("EMAIL ID :"+m.Empemail);
		System.out.println("PHONE_NO :"+m.EmpP_no);
		m.salary();
		System.out.println("..................................................");

		
		
		Employe t=new Trainee ("Faruk","225","9800394188","faruk229@gmail.com");
		
		t.show();
		
		System.out.println("NAME :"+t.Empname);
		System.out.println("EMPLOYEE ID :"+t.Empid);
		System.out.println("EMAIL ID :"+t.Empemail);
		System.out.println("PHONE_NO :"+t.EmpP_no);
		t.salary();
		
	}

}

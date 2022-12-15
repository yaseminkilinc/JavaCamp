package inheritance;

public class Main {

	public static void main(String[] args) {
		
		Customer customer=new Customer();
		Employee employee=new Employee();
		
		CustomerManager customerManager=new CustomerManager();
		EmployeeManager employeeManager=new EmployeeManager();
		
		customer.age=35;
		System.out.println("Musteri yasi:"+customer.age);
		
		
	}

}

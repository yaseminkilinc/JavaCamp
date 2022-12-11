
public class Program {

	public static void main(String[] args) {
		/*CreditManager creditManager=new CreditManager();
		creditManager.Calculate();
		creditManager.Save();
		
		Customer customer=new Customer();
		customer.Id=1;
		customer.city="Ankara";
		
		CustomerManager customerManager=new CustomerManager(customer);
		customerManager.Save();
		customerManager.Delete();
		
		CustomerManager customarManager2=new CustomerManager(new Person());
		
		Company company=new Company();
		company.taxNumber="100000";
		company.companyNames="Arcelik";
		company.Id=100;
		
		Person person=new Person();
		person.nationalIdentity="";
		
		Customer c1=new Customer();
		Customer c2=new Person();
		Customer c3=new Company();*/
		
		CustomerManager customerManager=new CustomerManager(new Customer(),new CarCreditManager());
		customerManager.GiveCredit();
		System.out.println();
	}

}

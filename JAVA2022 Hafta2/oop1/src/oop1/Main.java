package oop1;

public class Main {

	public static void main(String[] args) {
		
		String mesaj="Vade Orani";
		
		Product product1 = new Product();
					
		product1.setName("Delongi Kahve Makinesi");
		product1.setUnitPrace(7500);
		product1.setDiscount(7);
		product1.setUnitsInStock(3);
		product1.setImageUrl("bilmemne1.jpg");
		
		
		Product product2 = new Product();
		
		product2.setName("Smeg Kahve Makinesi");
		product2.setUnitPrace(7500);
		product2.setDiscount(7);
		product2.setUnitsInStock(3);
		product2.setImageUrl("bilmemne2.jpg");
		
		
		Product product3 = new Product();
		
		product3.setName("Kitchen Aid Kahve Makinesi");
		product3.setUnitPrace(7500);
		product3.setDiscount(7);
		product3.setUnitsInStock(3);
		product3.setImageUrl("bilmemne3.jpg");
		
		Product[] products= {product1,product2,product3};
		
		System.out.println("<ul>");
		
		for(Product product:products) {
			System.out.println("<li>"+product.getName() +"</li>");
		}
		
		System.out.println("</ul>");
		
		IndividualCustomer individualCustomer = new IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("052222222");
		individualCustomer.setCustomerNumber("12345");
		individualCustomer.setFirstName("Engin");
		individualCustomer.setLastName("Demirog");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("Kodlama.io");
		corporateCustomer.setPhone("0533333333");
		corporateCustomer.setTaxNumber("11111111111");
		corporateCustomer.setCustomerNumber("54321");
		
		

	}

}

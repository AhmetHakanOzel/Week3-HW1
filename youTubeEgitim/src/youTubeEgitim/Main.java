package youTubeEgitim;

public class Main {

	public static void main(String[] args) {
	/*	int sayi1 = 10;
		int sayi2 = 20;
		sayi1=sayi2;
		sayi2 = 100;
		System.out.println(sayi1);
//-------------------------------------------
		
		int sayilar1[] = {1, 2, 3};
		int sayilar2[] = {10, 20, 30};
		sayilar1 = sayilar2;
		
		sayilar2[0] = 1000;
		
		System.out.println(sayilar1[0]);
//-------------------------------------------
		creditManager creditManager = new creditManager();
		creditManager.calculate();
		creditManager.save();
		
		Customer customer = new Customer();
		customer.id = 1;
		customer.city = "Ankara";
		
		CustomerManager customerManager = new CustomerManager(customer);
		customerManager.save(customer);
		customerManager.delete(customer);
		
		Company company = new Company();
		company.taxNumber = "100000";
		company.comanyName = "Arçelik";
		company.id = 100;
		
		CustomerManager customerManager2 = new CustomerManager(new Person());
		
		Person person = new Person();
		person.firstName = "";
		person.nationalIdentity = "";
		Customer c1 = new Customer();
		Customer c2 = new Person();
		Customer c3 = new Company();
		*/
		
//---------------------------------------------------------------------------
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
		
		
	}

}

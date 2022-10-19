package youTubeEgitim;

public class CustomerManager {
	
	private Customer customer;
	private ICreditManager creditManager;
	
	public CustomerManager(Customer customer ,ICreditManager creditManager ) {
		customer = customer;
		creditManager = creditManager;
	}
	public void save(Customer customer) {
		System.out.println("Müşteri kaydedildi : ");
	}
	
	public void delete(Customer customer) {
		System.out.println("Müşteri silindi : ");
	}
	
	public void giveCredit() {
		creditManager.Calculate();
		System.out.println("Kredi verildi");
	}
	
	
}

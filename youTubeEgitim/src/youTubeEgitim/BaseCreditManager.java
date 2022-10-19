package youTubeEgitim;

public abstract class BaseCreditManager implements ICreditManager {
	public abstract void Calculate();
	public void save() {
		System.out.println("Kaydedildi");
	}
	
}

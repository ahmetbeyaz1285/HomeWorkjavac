package kodlamaioproject.businnes;

public abstract class BaseCreditManager implements 	CreditManager {
	public abstract void calculate();
	
	public void save() {
		
		System.out.println("Kredi kaydedildi");
		
	}

}

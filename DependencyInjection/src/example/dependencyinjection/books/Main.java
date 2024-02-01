package example.dependencyinjection.books;

public class Main {
	private final HarryPotter harryPotter;
	
	public Main(HarryPotter harryPotter)
	{
		this.harryPotter = harryPotter;
		
	}
	
	public void Execution()
	{
		System.out.println("Executing...");
		harryPotter.PerformWitchCarft();
	}
	public static void main(String[] args)
	{
		Spells harryPotter = new Spells();
		Main mainApp = new Main(harryPotter);
		
		mainApp.Execution();
	}

}

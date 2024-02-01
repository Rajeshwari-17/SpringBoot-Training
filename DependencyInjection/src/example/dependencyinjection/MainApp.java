package example.dependencyinjection;

public class MainApp{
	private final DataService dataService;
	//private final MyService myService;

    // Constructor injection of DataService
	/*public MainApp(MyService myService)
	{
		this.myService = myService;
	}*/
   public MainApp(DataService dataService) {
        this.dataService = dataService;
		//this.myService = null;
    }

    // Method using the injected dependency
    public void processData() {
        System.out.println("Processing data in the main application.");
        dataService.fetchData();
    }

    public static void main(String[] args) {
        // Creating an instance of the implementation class
        DataService dataService = new DataServiceimp1();

        // Creating an instance of the main class with dependency injection
        MainApp mainApp = new MainApp(dataService);

        // Calling the method that uses the injected dependency
        mainApp.processData();
    }
}


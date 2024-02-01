package example2;

public class Subject {
	public static void main(String[] args)
	{
		//Topic t = new Topic1();
		Topic t = new Topic2();
		t.understand();
		System.out.println("Loose Coupling Concept");
	}

}

/*public class Subject{
	public static void main(String[] args)
	{
		Topic t1 = new Topic1();
		t1.understand();
		
		Topic t2 = new Topic2();
		t2.understand();
			
	}
}
*/
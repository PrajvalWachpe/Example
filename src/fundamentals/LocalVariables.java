package fundamentals;

public class LocalVariables {
	
	public void display() {
		
		int num=10;
		System.out.println("Number:-"+num);
	}
	
	public void show()
	{
		double percentile=8.4;
		System.out.println("Percentage:-"+percentile);
	}

	public static void main(String[] args) {
	
		String college="Willson College";
		System.out.println("College:-"+college);
		LocalVariables lv=new LocalVariables();
		lv.display();
		lv.show();
		

	}
}

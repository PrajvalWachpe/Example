package abtraction.interfaces;

interface SchoolTemplate{
	public void attendance(String className, Integer StudentCount);
}

public class LambdaEx2 {

	public static void main(String[] args) {
		
		SchoolTemplate st=(c,s)->{
			System.out.println("The class anme is:-"+c);
			System.out.println("No. of student present"+s);
		};
		
		st.attendance("VIB", 25);
		
	}

}

package fundamentals;
/*
 * && and operator Both Condition have to be true
 * || or operator one of the condition has to be a true
 */
public class LogicalOper {
	
	public void eligibility(double marks, int expe) {
		
		System.out.println("Eligibility for TechMahindra:-"+((marks>60)&&(expe>2)));
		System.out.println("Eligibility for TCS:-"+((marks>60)||(expe>2)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double rameshMarks=61;
		int rameshExp=3;
		
		double sureshMarks=90;
		int sureshExp=0;
		
		LogicalOper lo=new LogicalOper();
		System.out.println("Eligibility for Ramesh...");
		lo.eligibility(rameshMarks, rameshExp);
		
		System.out.println("Eligibility for Suresh	...");
		lo.eligibility(sureshMarks, sureshExp);
		
		
	}

}

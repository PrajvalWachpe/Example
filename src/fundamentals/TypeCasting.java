package fundamentals;

public class TypeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double marks=80.46;
		System.out.println("Marks As double:-"+marks);
		
		int m=(int)marks;//covert double int, narrowing, down casting		
		System.out.println("|Marks into int type:-"+m);
		
		int num=400;
		double n=num;//up casting(storing small value ito big value)here we dont need to write type casting
		System.out.println("num:-"+num);
		System.out.println("Double Number:="+n);
	}

}

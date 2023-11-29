package stringPrograms;
/*
 * String immutability is ability of string to not change the original object.
 * Once String object created in SAP memory then we will not be able to change this object.
 * If we try to ConCat or make any other change then new string object is created.
 * 
 * we can refer this new string object by new variable or use the same old reference to now
 * point to new object
 */
public class StringImmutable {

	public static void main(String[] args) {
		
		String name1="Prajval";
		String name2="Prajval";
		
		System.out.println("Are name1 and name2 referring to same object:-"+(name1==name2));
		System.out.println("Before:\nname="+name1+"\nname2 ="+name2);
		
		name1=name1.toUpperCase();//same name1 variable will now refer to new object
		
		System.out.println("Are name1 and name2 referring to same object:-"+(name1==name2));
		System.out.println("Before:\nname="+name1+"\nname2 ="+name2);
		

	}

}

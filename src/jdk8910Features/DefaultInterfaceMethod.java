package jdk8910Features;
/*
 * Up-to JDK 7 we're able to make abstract method in interface, due to which any class that implements an 
 * interface had to give implementation to all abstract methods.
 * 
 *  But in jdk8 the concept of default method had been introduced in java. Now we can make methods having 
 *  it's own implementation inside the interface itself. We make such methods by declaring it with keyword default.
 *  
 *  Any child class which implements the interface having default methods do not have to override the default method again. 
 */
interface Camera{
	
	public void clickPic();
	public void flash();   
	default public void panaroma() {
		
		System.out.println("Taking long pics");
	}
	
}

class Gallery {
	public void savePics() {
		
		System.out.println("SAve pics in gallery");
	}
}

class Nikon extends Gallery implements Camera{  
	

	@Override
	public void clickPic() {
		System.out.println("Clicking pics..!");
		
	}

	@Override
	public void flash() {
		System.out.println("Flash Is On...!");
		
	}
	
}

public class DefaultInterfaceMethod {

	public static void main(String[] args) {
		
		Nikon n=new Nikon();

		n.clickPic();
		n.flash();
	}

}

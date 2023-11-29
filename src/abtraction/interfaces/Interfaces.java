package abtraction.interfaces;

interface Hotel{
	
	public void dinnig();
	public void buffet();

	/*
	 * Below we are seeing the nested interface. Meaning an interface which is 
	 * inside another interface.
	 */
	
	interface Banquet{
		
		public void weddingDecoration();
		public void partyDecoration();
	}
}

class RamBharose implements Hotel{
	
	public void dinnig() {
		
	}
	
	public void buffet() {
		
	}
}

class Sun implements Hotel, Hotel.Banquet{
	
	public void weddingDecoration() {
		
	}
	
	public void partyDecoration() {
		
	}

	@Override
	public void dinnig() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buffet() {
		// TODO Auto-generated method stub
		
	}
}
public class Interfaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

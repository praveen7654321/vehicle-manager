public class Vehicle{
	
	public static void main(String[] args) {
		PetrolEngine pE=new PetrolEngine();
		
		pE.start();
		
		DiselEngine dE=new DiselEngine();
		dE.start();
		
		
	}
}
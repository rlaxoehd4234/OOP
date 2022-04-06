package inheritance;

public class Driver05 {

	public static void main(String[] args) {
		panguin pororo = new panguin();
		
		pororo.name = "뽀로로";
		pororo.habitat = "남극";
		
		pororo.showHabitat();
		pororo.showName();
		
		animal pingu = new panguin();
		
		pingu.name = "핑구";
		pingu.showName();

	}

}

package inheritance;

public class Driver02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			animal[] animals = new animal[7];
			animals[0] = new animal();
			animals[1] = new Mammal();
			animals[2] = new Birds();
			animals[3] = new whale();
			animals[4] = new bat();
			animals[5] = new sparrow();
			
			for(int i = 0 ; i <animals.length; i++) {
				animals[i].showMe();
			}
			
			
			
	}

}

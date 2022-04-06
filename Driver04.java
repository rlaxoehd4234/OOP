package inheritance;

public class Driver04 {

	public static void main(String[] args) {
		
		swimable wha1 = new whale();
		flyable ba1 = new bat();
		flyable small = new sparrow();
		swimable pang1 = new panguin();
		
		wha1.swim();
		ba1.fly();
		small.fly();
		pang1.swim();
		
		
		swimable[] beer = new swimable[2];
		
		beer[0] = new whale();
		beer[1] = new panguin();
		
		for(swimable whale : beer) {
			whale.swim();
		}
	}

}

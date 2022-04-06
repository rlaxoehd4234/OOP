package inheritance;

public class bat extends Mammal implements flyable {
	bat() {
		myClass = "박쥐";
	}

	@Override
	public void fly() {
		System.out.println("팔락 팔락 팔락 ");
		
	}

}

package inheritance;

public class sparrow extends Birds implements flyable{
	
	sparrow () {
		myClass = "참새";
	}

	@Override
	public void fly() {
		System.out.println("팔락 팔락 팔락 팔락");
		
	}
	

}

package inheritance;

public class panguin extends Birds implements swimable{
	
	public String habitat;
	
	panguin() {
		myClass = "팽귄";
	}
	
	
	public void showHabitat() {
		System.out.printf("%s 는 %s 에 살아\n", name ,habitat);
	}
	
	

	@Override
	public void swim() {
		System.out.println("어푸 어푸 어푸 어푸 ");
	}

}

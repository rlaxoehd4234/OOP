package inheritance;

public class whale extends Mammal implements swimable {
	
	whale (){
		myClass ="고래";
	}

	@Override
	public void swim() {
		System.out.println("어푸어푸어푸어푸어푸어");
		
	}

}

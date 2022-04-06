package polymorphism;

public class Penguin extends Animal{
	
	public String habitat;
	
	
	public void showHabitat() {
		System.out.printf("나는 %s 에 살아.",habitat);
		
	}
	
	public void showName() {
		System.out.println("내 이름 알아서 뭐하게 ?");
	}
	
	public void showName(String yourName) {
		System.out.printf("%s 안녕, 나는 %s 라고해\n ",yourName,name);
	}
	

}

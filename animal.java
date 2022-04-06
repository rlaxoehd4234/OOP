package inheritance;

public class animal {
	
	String myClass;
	String name;
	
	animal() {
		myClass = "동물";
	}
	
	void showMe() {
		System.out.println(myClass);
	}

	public void showName() {
		System.out.printf("안녕 나는 %s 야 만나서 반가워.",name);
	}
}

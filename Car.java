package opencloseprinciple;

public class Car implements GearChange,openWindow{

	@Override
	public void Geartrans() {
		System.out.println("기어가 바뀝니다.");
		
		
	}

	@Override
	public void ClearWindow() {
		System.out.println("창문이 내려갑니다.");
		
		
	}
	
	
	
	

}

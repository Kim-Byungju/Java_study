package step3_인터페이스;



public class PhoneEx {

	public static void main(String[] args) {
		 PhoneInterface p = new PhoneInterface() {
			
			@Override
			public void sendCall() {
				System.out.println("전화를 겁니다.");
				
			}
			
			@Override
			public void reciveCall() {
				System.out.println("전화를 받습니다.");
				
			}
			
		};

		p.sendCall();
		p.reciveCall();
	
	}

}

package step3_인터페이스;


class LGphone implements PhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("LG폰으로 전화를겁니다");
		
	}

	@Override
	public void reciveCall() {
		System.out.println("LG폰으로 전화를 받습니다");
		System.out.println("지정된 시간:"+TiMEOUT );
		
	}
	
	public void printLogo( ) {
		System.out.println("*****LG phone*****");
	}
	
}
public class phoneLG {
	public static void main(String[] args) {
		LGphone lg = new LGphone();
		
		lg.sendCall();
		lg.reciveCall();
		lg.printLogo();
	}
}

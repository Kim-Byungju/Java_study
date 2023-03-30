package step3_인터페이스;

interface AIInterface {
	void recognizeSpeech ();
	void systhesizeSpeech ();
	
}

class AIPhone implements MobilePhoneInterface, PhoneInterface, AIInterface {
	
	
	public void printLog() {
		System.out.println("******삼성 AI폰********");
	}
	
	@Override
	public void recognizeSpeech() {
		System.out.println("음성인식잘해요");
		
	}

	@Override
	public void systhesizeSpeech() {
		System.out.println("음성합성잘해요");
		
	}

	@Override
	public void sendCall() {
		System.out.println("AI전화받아요");
		
	}

	@Override
	public void reciveCall() {
		System.out.println("AI가 전화 걸어요");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("AI문자 보내요");
		
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("AI문자 받아요");
		
	}
	
}

public class SamsingAIPhoneEx {
	public static void main(String[] args) {
		AIPhone ai = new AIPhone();
		
		ai.sendCall();
		ai.reciveCall();
		ai.sendSMS();
		ai.receiveSMS();
	}
}

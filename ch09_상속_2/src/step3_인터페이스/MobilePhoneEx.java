package step3_인터페이스;



interface MobilePhoneInterface{
	
	//추가
	void sendSMS();
	void receiveSMS();
}

interface MP3Interface extends PhoneInterface {
	void play();
	void stop();
}
interface MusicPhoneInterface extends PhoneInterface, MobilePhoneInterface, MP3Interface {
	void playMP3Ringtone();
}

class Myphone implements MusicPhoneInterface {

	@Override
	public void sendCall() {
		System.out.println("내폰으로 전화걸기");
		
	}

	@Override
	public void reciveCall() {
		System.out.println("내폰으로 전화받기");
		
	}

	@Override
	public void sendSMS() {
		System.out.println("내폰으로 문자 보내기");
		
	}

	@Override
	public void receiveSMS() {
		System.out.println("내폰으로 문자 받기");
		
	}

	@Override
	public void play() {
		System.out.println("내폰으로 음악 재생하기");
		
	}

	@Override
	public void stop() {
		System.out.println("내폰으로 음악 멈추기");
		
	}

	@Override
	public void playMP3Ringtone() {
		System.out.println("내폰으로 벨소리.. 슈파러맙마바쌉싸리~~");
		
	}
	
}
public class MobilePhoneEx {
	public static void main(String[] args) {
		
		Myphone mp = new Myphone();
		
		mp.sendCall();
		mp.receiveSMS();
		mp.reciveCall();
		mp.play();
		mp.stop();
		mp.playMP3Ringtone();
	
	}
}

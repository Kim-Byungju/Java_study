package step3_인터페이스;

public interface PhoneInterface {
	
	public static final int  TiMEOUT = 10000;
	public abstract void sendCall();
	public abstract void reciveCall();
	public default void printLogo() {
		System.out.println("***phone***");
		System.out.println(TiMEOUT);
	}
}

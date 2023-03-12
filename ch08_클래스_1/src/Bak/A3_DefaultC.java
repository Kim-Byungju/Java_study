package Bak;

import step5_접근지정자.A3_DefaultA;

public class A3_DefaultC extends A3_DefaultA{ //상속

	String address;
	A3_DefaultC() {
		
		//다른패키지접근불가 - 디폴트 지점
		//pa.name ="이순신";
		
	}
	String getAddress() {
		return address;
	}
}

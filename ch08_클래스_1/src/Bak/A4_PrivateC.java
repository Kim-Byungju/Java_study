package Bak;

import step5_접근지정자.A4_PrivateA;

public class A4_PrivateC extends A4_PrivateA{ //상속

	String address;
	A4_PrivateC() {
		
		//다른패키지접근불가 - 디폴트 지점
		//pa.name ="이순신";
		
	}
	String getAddress() {
		return address;
	}
}

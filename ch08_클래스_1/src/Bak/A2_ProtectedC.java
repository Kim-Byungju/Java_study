package Bak;

import step5_접근지정자.A2_ProtectedA;

public class A2_ProtectedC extends A2_ProtectedA{ //상속

	String address;
	A2_ProtectedC() {
		
		
		name ="이순신";
		getName();
	}
	String getAddress() {
		return address;
	}
}

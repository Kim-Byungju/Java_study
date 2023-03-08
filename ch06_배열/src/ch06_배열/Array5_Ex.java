package ch06_배열;

import java.util.Arrays;
import java.util.Scanner;

public class Array5_Ex {
	public static void main(String[] args) {
		
		System.out.println("회원등록 업무를 시작합니다...");
		Scanner sc = new Scanner(System.in);
		
		String[] strName1 = new String[10];
		int[] intAge = new int[10];
		float[] floatWeight = new float[10];
		
		boolean flag = true;
		int index = 0;
		
		while(flag) {
			System.out.println((index+1)+"번째 회원님을 등록합니다.");
			
			System.out.println("이름?>");
			strName1[index] = sc.next();
			
			System.out.println("나이?>");
			intAge[index] = sc.nextInt();
			
			System.out.println("몸무게?>");
			floatWeight[index] = sc.nextFloat();
			
			System.out.println("계속 등록하시겠습니다? (y/n)");
			String answer = sc.next();
			
			if(index >= strName1.length || answer.equals("n")) {
				System.out.println("회원등록을 마칩니다. ㅅㄱ^^");
				flag= false;
			} 
			index++;
		}
		System.out.println("등록된 회원님을 소개할까요? (y/n)");
		String answer = sc.next();
		if(answer.equals("y")) {
			for(int i=0; i<strName1.length; i++) {
				System.out.println(i+1+"번쨰 회원님*********");
				System.out.println("이름"+strName1[i]);
				System.out.println("나이"+intAge[i]);
				System.out.println("몸무게"+floatWeight[i]);		}
			
		}else {
			System.out.println("프로그램을 종료합니다. ㅅㄱ^^*");
//			System.exit(0);
		}
		
		//배열복사1
		System.out.println("배열복사1");
		String[] strName2 = strName1;
		strName2[0] = "대한민국";
		System.out.println(strName1[0]);
		
		for(String str: strName2) {
			System.out.println(str+"");
		}
		System.out.println();
	//**********************************************************	
		System.out.println("배열복사2");
		//배열복사2, for문을 이용한
		String[] strName3 = new String[10];
		for(int i=0; i<strName1.length; i++) {
			strName3[i] = strName1[i];			
		}
		for(String name : strName3) {
			//출력
			System.out.println(name+"");
		}
		System.out.println();
		//**********************************************************		
		//배열복사3
		System.out.println("배열복사3");
		int[] intAge2=new int[10];
		System.arraycopy(intAge, 1, intAge2, 2, 2);
		for(int age: intAge2) {
			//출력
			System.out.println(age+"");
		}
		System.out.println();
		//**********************************************************	
		//배열복사4
		System.out.println("배열복사4");
		float[] floatweight2 = Arrays.copyOf(floatWeight, 3);
		for(float weight:floatWeight) {
			//출력
			System.out.println(weight+"");
		}
		
		
		
		sc.close();
	}

}

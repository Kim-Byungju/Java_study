package Ex;

import java.util.Scanner;
import java.util.Vector;

public class Int_Input {

	public static void main(String[] args) {
		
		Vector<Integer> vc = new Vector<Integer>();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 10개 입력하고, -1을 입력하여 입력을 완료하세요.");
		
		boolean flag = true;
		
		while(flag) {
			int it = sc.nextInt();
			vc.add(it);
			
			if(it>-1) {
				flag = true;
			} else if(it==-1) {
				flag = false;
			} 
		}
		System.out.println("입력완료 ");
		System.out.println("입력한 정수는 아래와 같습니다.");
		for(int i = 0; i<vc.size(); i++) {
			int a = vc.get(i);
			System.out.println(a);
		}
		System.out.println();
		
		int biginteg = 0;
		for(int i = 0; i<vc.size(); i++) {
			if(vc.get(i)>vc.get(biginteg)) {
				biginteg = i;
			}
		}
		System.out.println("가장큰 숫자는 "+vc.get(biginteg));
		sc.close();
	}
	
}

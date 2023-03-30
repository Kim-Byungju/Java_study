package system;

import java.io.IOException;

public class S2_PrintStream {

	public static void main(String[] args) throws IOException {

		char in = 0;
		System.out.println("여러개의 영문자를 입력하세요");
		while(true) {
			in = (char)System.in.read();  //ctrl+z는 -1을 반환
			if(in==13 || in==10) {  //엔터값
				continue;
			}
				if(in == 'q') {
					break;
				}
				System.out.println(in);
				System.out.println("입력받은 문자들은 : ");
			}
			
			
		}

	}


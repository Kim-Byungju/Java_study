package system;

import java.io.IOException;

/*
	.System
		- 모든멤버가 static로 선언되어 있따.
		- 중요한 기능 가운데 하나는 표준입출력 스트림을 제공한다는것.
		- 제공하는 스트림
			1)static PrintStream err : 표준 에러출력
			2)static InputStream in : 표준입력스트림
			3)static PrintStream out  : 표준출력스트림 - 정상 데이터 출력
			
		-엔터키 : CR(carrage Return)+LF(Line Feed)로 변환입력된다.
						13				10
*/
public class S1_PreintScreen {

	public static void main(String[] args) throws IOException {
		
		char in = 0;
		System.out.println("현재의 문자를 입력하세요");
		in =(char)System.in.read();
		
		System.out.println(in);
	}

}

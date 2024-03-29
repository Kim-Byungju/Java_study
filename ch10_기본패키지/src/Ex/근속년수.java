package Ex;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

public class 근속년수 {

	static StringTokenizer st;
	//문자열로 받은 입사연월을 문자배열에 년월일로 저장해서 리턴해주는 메소드
	static int[] setJoinDate(String join) {
		
		Calendar converDate1 = Calendar.getInstance();
		
		//받아서 문자열 배열에 넣기 - String split()메소드로도 가능
		st = new StringTokenizer(join.trim(),"."); //토큰으로 분리
		String[] strDate = new String[3];
		int[] intDate =new int[3];
		int i = 0;
		while(st.hasMoreTokens()); {
			strDate[i] = st.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]); //[년][월][일]
			i++;
	}
	converDate1.set(intDate[0],intDate[1],intDate[2]);
	return intDate;
	}
	//문자열로 받은 퇴사 년월일을 문자열 배열에 년월일로 저장해서 리턴해주는 메소드
	static int[] setResignDate(String resign) {
		Calendar converDate1 = Calendar.getInstance();
		
		//받아서 문자열 배열에 넣기
		st = new StringTokenizer(resign.trim(),"."); //토큰으로 분리
		String[] strDate = new String[3];
		int[] intDate =new int[3];
		int i = 0;
		while(st.hasMoreTokens()); {
			strDate[i] = st.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]); //[년][월][일]
			i++;
	}
	converDate1.set(intDate[0],intDate[1],intDate[2]);
	return intDate;
	
	}
	//근속연수 계산해주는 메소드
	static interface CalculatingDifference {
		String result(int[] start, int[] end);
	}
	static class GetDaysOfCalculated {
		
		CalculatingDifference gap = 
				(join,resign) -> {
					int yy = resign[0]-join[0]; //년도계산
					int mm = resign[1]-join[1]; //월계산
					int dd = resign[2]-join[2]; //일계산
					return (Integer.toString(yy)+"년"+
					        Integer.toString(mm)+"월"+
							Integer.toString(dd));
				};
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입사일받기
		System.out.println("입사년월일을 입력하시오(2000,3,1)");
		String joining = sc.nextLine();
		int[] joinArr = setJoinDate(joining);
		System.out.println("입사일 "+joinArr[0]+"년"+joinArr[1]+"월"+joinArr[2]+"일");
		// 퇴사일받기
		System.out.println("퇴사년월일을 입력하시오(2000,3,1)");
		String resign = sc.nextLine();
		int[] resignArr = setResignDate(resign);
		System.out.println("퇴사일 "+resignArr[0]+"년"+resignArr[1]+"월"+resignArr[2]+"일");
		
		//근속년수계산하기
		//static Inner클래스 객체생성 : A.B obj = new A.B();
		근속년수.GetDaysOfCalculated calculator = new 근속년수.GetDaysOfCalculated();
		String result = calculator.gap.result(joinArr,resignArr);
		
		System.out.println(result);

	}
	

}

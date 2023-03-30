package Ex;

import java.util.Calendar;
import java.util.Scanner;
import java.util.StringTokenizer;

//년월일 문자열을 정수 배열로 반환
interface ConvertDate2 {
	int[] setDate(String date);
}
class ConvertDateArr2 implements ConvertDate {

	@Override
	public int[] setDate(String date) {
		StringTokenizer st;
		Calendar convertDate1 = Calendar.getInstance();
		
		st = new StringTokenizer(date.trim(),".");
		String[] strDate = new String[3];
		int[] intDate = new int[3];
		int i = 0;
		while (st.hasMoreTokens()) {
			strDate[i] = st.nextToken().trim();
			intDate[i] = Integer.parseInt(strDate[i]);
			i++;
		}
		convertDate1.set(intDate[0], intDate[1], intDate[2]);
		return intDate;
	}
	
}
//계산
class GetDaysOfCalculated2 {
	public String getResult (int[] join, int[] resign) {
		int yy = resign[0]-join[0];
		int mm = resign[1]-join[1];
		int dd = resign[2]-join[2];
		
		return(Integer.toString(yy)+"년"+
				Integer.toString(mm)+"월"+
				Integer.toString(dd)+"일");
	}
}
public class 근속년수3 {
	
	static ConvertDateArr2 cda = new ConvertDateArr2();
	static GetDaysOfCalculated2 gct = new GetDaysOfCalculated2();
	
	static int[] action(String date) {
		int[] intDateArr = cda.setDate(date);
		System.out.println("입력값 : " +intDateArr[0]+"년"+
										intDateArr[1]+"월"+intDateArr[2]+"일");
		return intDateArr;
	}
	//근속연수 계산해주는 메소드
		static String getDaysOfCalculated(int[] join,int[] resign) {
			GetDaysOfCalculated gct = new GetDaysOfCalculated();
			return gct.getResult(join, resign);
		}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		// 입사일받기
		System.out.println("입사년월일을 입력하시오(2000,3,1)");
		String joining = sc.nextLine();
		// 퇴사일받기
		System.out.println("퇴사년월일을 입력하시오(2000,3,1)");
		String resign = sc.nextLine();
		
		//입력결과
		String result = gct.getResult(action(joining), action(resign));
		
		//근속년수 계산하기..
		//너가해봐라
		//String numberOfDayService = getDaysOfCalculated(join, resign);  //매개변수값만 잘넣으면됨...
		//System.out.println("근속기간 : "+numberOfDayService);
		
		System.out.println("계속하시겠습니까(y/n)>>");
		
		String answer = sc.next();
		if(answer.equals("n")) {
			sc.close();
			break;
			}
		System.out.println("*******************************");
		sc.nextLine();
		}
		System.out.println("프로그램을 종료합니다....ㅅㄱ링..");
		System.exit(0);
	}

}

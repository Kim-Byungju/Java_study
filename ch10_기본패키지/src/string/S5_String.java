package string;



import java.util.Comparator;

public class S5_String {

		static String[] arr = {
				"IMF" , "제주도", "자바도사", "한글나라", "Computer", "모카", 
				"인터넷탐색","초롱초롱","Com", "바람", "스크립터", "군고구마", "도서",
				"their"
		};
	public static void main(String[] args) {
		
	
		
		//정렬전 데이터 출력
		//정렬후 데이터 출력 -sort쓰지마
		//compareTo() - 현재의 스트링이 다른스트링보다 크면 양수(+), 작으면  음수(ㅡ), 같으면(0)으로 반환하는 메소드
		System.out.println("정렬형 데이터=====");
		for(String s: arr) {
			System.out.println(s+"");
		}
		System.out.println();
		
		System.out.println("정렬후 데이터=====");
		for(int i = 0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i].compareTo(arr[j])>0) {
					String tmp = arr[i];
					arr[i] =arr[j];
					arr[j]=tmp;
				}
			}
			System.out.println(arr[i]+"");
		}

	}

}

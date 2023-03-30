package collection;

import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> ts = new TreeSet<String>();
		
		ts.add("홍길동");
		ts.add("강감찬");
		ts.add("김두한");
		ts.add("김두한");
		ts.add("김두한");
		
		for(String str: ts) {   //for - each문으로,..
			System.out.println(str);  //가나다순 정렬, 중복 불가
		}

	}

}

package Object;

class Rect {
	int width;
	int height;  //너비,높이
	public Rect(int width, int height) {
		this.height = height;
		this.width = width;
	} 	//생정자로 초기화
	public boolean equals(Object obj) {   	//equals(Rect obj) 이용.  Rect ---> Object로 바꾸면 >> 형변환~!!
		if(width*height == ((Rect)obj).width*((Rect)obj).height) {   
			return true;
		} else {
			return false;  //너비*높이 == obj.width*obj.height 같다면 ture 다르다면 false
		}	
	}
}

public class Obj4 {

	public static void main(String[] args) {
		
		
		//Rect 객체생성1 -2,3 
		//Rect 객체생성2 -3,2
		//Rect 객체생성3 -3,4
		Rect rc1 = new Rect(2, 3);
		Rect rc2 = new Rect(3, 2);
		Rect rc3 = new Rect(3, 4);
		
		
		//if문이용 a is equals to b?? 3개의 객체 체크
		if(rc1.equals(rc2)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if(rc2.equals(rc3)) {
			System.out.println("같다.");
		} else {
			System.out.println("다르다.");
		}
		if(rc1.equals(rc3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		


	}

}

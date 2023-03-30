package Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person2 implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8537038704534794022L;
	private String name;
	private int age;
	private String address;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person2(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public Person2() {
		
	}
}
class PersonArr implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6212334950094799927L;
	Person2[] arr;
	public PersonArr() {
		arr = new Person2[5];
	}
}
public class S3_Serialization {

	public static void main(String[] args) {
			Person2 p1 = new Person2();
			p1.setName("홍길");
			p1.setAge(20);
			p1.setAddress("한양시");
			
			Person2 p2 = new Person2("슈퍼맨",40,"워싱턴" );
			Person2 p3 = new Person2("배트맨",30,"고담" );
			Person2 p4 = new Person2("스파이더맨",25,"뉴욕" );
			Person2 p5 = new Person2("앤트맨",45,"개미굴" );
			
			PersonArr p = new PersonArr();
			p.arr[0] = p1;
			p.arr[1] = p2;
			p.arr[2] = p3;
			p.arr[3] = p4;
			p.arr[4] = p5;
			
			try {
				//스트림 생성
				FileOutputStream fio = new FileOutputStream("C:\\Users\\admin\\Desktop\\KBJ\\file\\serialization2.out",true);
				ObjectOutputStream objout = new ObjectOutputStream(fio);
				
				//쓰기 
				objout.writeObject(p);
				System.out.println("정상적으로 직렬화 되었습니다.");
				
			} catch (IOException e) {
				System.out.println("직렬화중 오류가 발생되었습니다.");
			}

	}

}

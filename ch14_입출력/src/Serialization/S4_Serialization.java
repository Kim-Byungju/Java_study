package Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


public class S4_Serialization {

	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\admin\\Desktop\\KBJ\\file\\serialization2.out");
			ObjectInputStream objin = new ObjectInputStream(fin);
			
			PersonArr pa = (PersonArr)objin.readObject();
			
			for(int i = 0; i<pa.arr.length; i++) {
				if(pa.arr[i]==null) {
					break;
				} else {
					System.out.println(pa.arr[i].getName());
					System.out.println(pa.arr[i].getAge());
					System.out.println(pa.arr[i].getAddress());
				}
			}
			System.out.println("출력이 완료되었습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}

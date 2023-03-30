package 표준입출력;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Standard3 {

	public static void main(String[] args) {
		try {
			FileInputStream fio 
				= new FileInputStream("C:/Users/admin/Desktop/KBJ/file/file1.txt");
			
			//스캐너와 연결
			Scanner sc = new Scanner(fio);
			
			String str = sc.next();
			System.out.println(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}

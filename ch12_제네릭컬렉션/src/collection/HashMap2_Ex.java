package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.HashMap;

class Student3 {
	private int id;
	private String name, tel;
	
	public Student3(int id, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTel() {
		return tel;
	}


	public void setTel(String tel) {
		this.tel = tel;
	}	
}
//FamilyPerson 
class FamilyHashMap {
	private HashMap<Student3, String> hm;
	
	public FamilyHashMap() {
		hm = new HashMap<Student3, String>();
	}
	void addMember(String key, Student3 s){
		hm.put(s, key);
	}
	
	boolean removeMember(String name) {
		return false;
//		Set<String> keys = hm.key();
//		Iterator<String> it = Keys.iterator();
//		while(it.hasNext()) 
				
		}
	
	void showAllMembers( ) {
		
	}
}

public class HashMap2_Ex {

	
	public static void main(String[] args) {
		
		FamilyHashMap fm = new FamilyHashMap();
		
		
		
		

	}

}

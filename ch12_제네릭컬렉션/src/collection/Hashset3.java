package collection;

import java.util.HashSet;
import java.util.Iterator;

class Member {
	private String name,tel;
	Member(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	public String getMemberName() {
		return name;
	}
	public String getMemberTel() {
		return tel;
	}
}

class MemberHashSet {
	//필드선언
	private HashSet<Member> hs;
	
	//생성자
	public MemberHashSet() {
		hs = new HashSet<Member>();
	}
	//회원 추가 메소드
	void addMember(Member m) {
		hs.add(m);
	}
	//회원 삭제 메소드
	boolean removeMember(String name) {
		Iterator<Member> it = hs.iterator();
		while(it.hasNext()) {
			Member m = it.next();
			//비교
			String tmpName = m.getMemberName();
			
			if(tmpName.equals(name)) {
				hs.remove(m); //객체를 지워야 삭제됨
				return true;
			}
		}
		System.out.println(name+"가 존재하지 않습니다.");
		return false;
	}
	//회원 조회 메소드
	void showAllMember() {
		for(Member m: hs) {
			System.out.println(m.getMemberName()+" 회원의 전화번호는 "+
								m.getMemberTel()+" 입니다.");
		}
		System.out.println();
	}
	
}
public class Hashset3 {

	public static void main(String[] args) {
		//1.MemberHashSet 객체생성
		MemberHashSet mh = new MemberHashSet();  //해쉬셋 생성, 위 클래스 생성자에서 미리 해쉬셋기능 생성하였음 
		
		//2. Member 생성
		Member mLee = new Member("이지원","010-1111-2222");
		Member mSon = new Member("손민국","010-2222-3333");
		
		//3. Member등록
		mh.addMember(mLee);
		mh.addMember(mSon);
		mh.addMember(new Member("박서현","010-3333-4744"));
		
		//4.전체조회
		mh.showAllMember();
		System.out.println("************");
		
		//5.회원삭제
		mh.removeMember("이지원");
		mh.showAllMember();
		
		
	}

}

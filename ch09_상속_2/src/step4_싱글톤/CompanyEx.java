package step4_싱글톤;

//싱글톤
class Company {
	
	private static Company instance = new Company();
	private Company () {
		
	}
		public static Company getInstance() {
			
			if(instance == null) {
			Company instance = new Company();
			}
			return instance;
		}
	}

public class CompanyEx {

	public static void main(String[] args) {
		
	//	Company instance = new Company(); 
		
		Company c1 = Company.getInstance();
		Company c2 = Company.getInstance();
		Company c3 = Company.getInstance();
		
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

	}

}

package Wrapper;

public class W1_Integer {

	public static void main(String[] args) {
		
		
		//박싱
		//Integer num1 = new Integer(10);
		//Integer num1 = Integer.valueOf(10);
		Integer num1 = 10;
		
		String strNum = Integer.toString(10);  
		int intNum = Integer.parseInt("10");
		int a = (int)intNum;
		
		//언박싱
		//int num2 = num1.intValue();
		int num2 = num1;
		
		//박싱
		//Character charStr = new Character('a');
		//Character charStr = Character.valueOf('a');
		Character charStr = 'a';
		
		//언박싱
		char ch = charStr.charValue();
		
		//박싱
		
		//Float floatNum = new Float(3.14);
		//Float flotNum = Float.valueOf(3.14f);
		Float floatNum = 3.14f;
		
		//언박싱
		//float f1 = floatNum.floatValue();
		float f1 = floatNum;
		
		
		
		//박싱
		//Double doubleNum = new Double(3.1234);
		//Double doubleNum = Double.valueOf(3.12d);
		Double doubleNum = 3.1234;
		
		//언박싱
		//double d1 = doubleNum.doubleValue();
		double d1 = doubleNum;
		
		Double dc = Double.parseDouble("3.1234");
		String ds = Double.toString(dc);
		
		

	}

}

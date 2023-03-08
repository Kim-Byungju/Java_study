package Ex;

import java.util.Scanner;

/*
1. 학생의 이름,국어점수, 영어점수, 수학점수, 각 5개를 입력받아서
2. 이름 - 1차원 배열
3. 국어/영어/수학/total - 2차원 배열
4. 평균 1차원 배열
*단 total과 평균은 연산하여 배열에 저장하고
	전체를 출력하시오
*/
public class Ex4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] strName = new String [5];
		int[][] intScore = new int[4][5];
//		int[] intEng = new int[7];
//		int[] intMath = new int[7];
//		int[] intTotal = new int[7];
		float[] floatAvg = new float[5];
		
		while(true) {
			for(int i =0; i<strName.length; i++) {
			System.out.println((i+1)+"번째 학생들의 이름을 입력해주세요.");
				strName[i] = sc.next();
			}
			System.out.println("학생들의 이름은 : "+strName[0]+","+strName[1]+","+strName[2]+","
											+strName[3]+","+strName[4]);
			for(int j = 0; j<intScore.length; j++) {
				for(int k =0; k<intScore[j].length; k++) {
					System.out.println("국어, 영어, 수학 점수를 차례대로 입력 하시오");
					intScore[j][k] = sc.nextInt();
					System.out.print("국어, 영어, 수학 점수는 아래와 같다.\n");
					System.out.print(intScore[j][k]);
				}
			}
			System.out.println();
		}
		
	}	
}
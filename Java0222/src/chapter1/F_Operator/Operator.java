package chapter1.F_Operator;

public class Operator {
	public static void main(String[] args) {
		int num = 11;
		
		String re = num == 10 ? "true" : "false";
		System.out.println(re);
		
		// 증감 연산자
		int integer1 = 10;
		++integer1; // 증가하고 읽힘.
		integer1++; // 읽히고 증가함.
		
		int integer2 = 0;
		System.out.println(integer2); // 0
		System.out.println(++integer2); // 1
		
		System.out.println(integer2); // 1
		System.out.println(integer2++); // 1
		
		System.out.println(integer2); // 2
		
		int number1 = 8;
		int number2 = 3;
		int sampleNumber = number1 + number2++;
		System.out.println("증가 연산 = " + sampleNumber);
		
		                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        
		boolean boolean1 = ( number1 < number2 ) && (++number1 > number2); // 논리 연산은 논리식 만나고 조건이 맞으면 그 뒤는 계산 안함. 
		
		int a = 0;
		System.out.println(a++);
		System.out.println(a);
		System.out.println(++a);
		
	}
}

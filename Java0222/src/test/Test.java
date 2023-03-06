package test;

class Class01 {
	int x;
}

public class Test {
	public static void main(String[] args) {
		Class01 num = new Class01();
		num.x = 100;
		System.out.println("Class : "+num.x);
		
		System.out.println("method : "+method01(num));
        		
		System.out.println("Class : "+num.x);
	}
	
	static int method01(Class01 test) {
		test.x = 1000;
		return test.x;
	}
}

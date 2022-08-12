/*
 * 1. 원래 Lambda는 Scala나 Groovy에서 사용하기 위해 만든 익명 메소드
 * 2. Java는 1.8 버전에서 함수형 언어를 구현하기 위해 도입함.

 * 
 */
public class LambdaDemo {
	public static void main(String[] args) {

		MyInterface mi = (a, b) -> a + b;
		int result = mi.calculate(5,  9);
		System.out.println("Result = " + result);
		
		mi = (a, b) -> a * b;
		result = mi.calculate(5,  9);
		System.out.println("Result = " + result);
		
		mi = (a, b) -> a - b;
		result = mi.calculate(5,  9);
		System.out.println("Result = " + result);
	}
}

@FunctionalInterface
interface MyInterface{
	int calculate(int a, int b);
}
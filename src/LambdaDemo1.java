
public class LambdaDemo1 {
	public static void main(String[] args) {
		LambdaDemo1 Ld = new LambdaDemo1();
		//YourClass yc = Ld.new YourClass();
		//Ld.exec(yc);      //1st way
//		Ld.exec(new YourInterface() {      //2nd way
//			@Override
//			public int comare(int a, int b) {
//				return a - b;
//			}
//		});
		Ld.exec((a, b) -> a - b);               //3rd way
	}
	void exec(YourInterface yi) {
		int result = yi.comare(5,  9);
		System.out.println(result);
	}
	
//	class YourClass implements YourInterface{
//
//		@Override
//		public int comare(int a, int b) {
//			return a - b;
//		}
//		
//	}
}


class Operation {
	
	// 6.1 -----------------------------------------------------------------------------
	
	public static int addition(int nb1, int nb2) {
		return nb1 + nb2;
	}
	
	public static int substract(int nb1, int nb2) {
		return nb1 - nb2;
	}
	
	public static int multiplication(int nb1, int nb2) {
		return nb1 * nb2;
	}
	
	public static int division(int nb1, int nb2) {
		if (nb2 == 0) {
			return 0;
		}
		return nb1/nb2;
	}
	
	
	// main----------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		System.out.println(addition(5,2));
		System.out.println(substract(5,2));
		System.out.println(multiplication(5,2));
		System.out.println(division(3,0));

	}
}
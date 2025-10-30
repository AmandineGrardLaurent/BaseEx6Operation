class Operation {
	public static double addition(double nb1, double nb2) {
		return nb1 + nb2;
	}
	
	public static double substract(double nb1, double nb2) {
		return nb1 - nb2;
	}
	
	public static double multiplication(double nb1, double nb2) {
		return nb1 * nb2;
	}
	
	public static double division(double nb1, double nb2) {
		if (nb2 == 0) {
			return 0;
		}
		return nb1/nb2;
	}
	
	public static void main(String[] args) {
		System.out.println(addition(5,2));
		System.out.println(substract(5,2));
		System.out.println(multiplication(5,2));
		System.out.println(division(3,0));
	}
}
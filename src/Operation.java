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
	
	// 6.2 -----------------------------------------------------------------------------

	public static void repeat(int nbRepeat, String symbole) {
		// Répéter un symbole x fois
		for(int j = 1; j <= nbRepeat ; j++) {
				System.out.print(symbole);
			}
	}
	
	public static void triangle(int nbStars) {
		int positionTriangle = nbStars/2;
		for(int i = 1; i <= nbStars; i+=2) {
			
			repeat(positionTriangle-=1," ");
			repeat(i,"*");
			System.out.println("");
		}
		
	}
	
	//-----------------------------------------------------------------------------
	
	public static void main(String[] args) {
		System.out.println(addition(5,2));
		System.out.println(substract(5,2));
		System.out.println(multiplication(5,2));
		System.out.println(division(3,0));
		
		triangle(20);
	}
}
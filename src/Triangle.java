class Triangle {
	
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
	
	// main----------------------------------------------------------------------------
	
	public static void main(String[] args) {

		triangle(20);
		
	}
}
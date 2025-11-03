
class Operation {
	
	// 6.1 -----------------------------------------------------------------------------
	
	public static int addition(int nb1, int nb2) {
		return nb1 + nb2;
	}
	
	public static int subtract(int nb1, int nb2) {
		return nb1 - nb2;
	}
	
	public static int multiplication(int nb1, int nb2) {
		return nb1 * nb2;
	}
	
	public static double division(int nb1, int nb2) {
		if (nb2 == 0) {
			return 0;
		}
		return nb1/nb2;
	}
	
	/**
     * Multiplie chaque élément d'une matrice par un scalaire (un nombre entier).
     * 
     * @param matrix la matrice à multiplier
     * @param number le scalaire (nombre entier) par lequel chaque élément de la matrice sera multiplié
     * @return une nouvelle matrice contenant le résultat de la multiplication
     */
	public static int [][] mulScalMatrix(int [][] matrix, int number) {
	int[][] matrixResult = new int[matrix.length][matrix[0].length];
		for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
            	// Multiplication de chaque élément par le scalaire
            	matrixResult[i][j] = matrix[i][j] * number;
            }
		}
		return matrixResult;
	}
	
	
	// main----------------------------------------------------------------------------
	
	public static void main(String[] args) {
		
		System.out.println(addition(5,2));
		System.out.println(subtract(5,2));
		System.out.println(multiplication(5,2));
		System.out.println(division(3,0));

	}
}
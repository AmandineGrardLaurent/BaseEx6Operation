class Matrix{
	
	/**
     * Effectue une opération élément par élément entre deux matrices (addition, soustraction, multiplication, division).
     * @param matrix1 : première matrice
     * @param matrix2 : seconde matrice
     * @param operatorSymbol : type d’opération ("addition", "substract", "multiplication", "division")
     * @return la matrice résultante, ou null si les dimensions ne sont pas compatibles
     */
	public static int [][] applyMatrixOperation(int [][] matrix1, int [][] matrix2, String operatorSymbol) {
		// [] lignes
		// [][] colonnes
		
		 // Nombre de lignes et de colonnes de la première matrice
		int matrix1_rows = matrix1.length;
		int matrix1_cols = matrix1[0].length;
		
		// Nombre de lignes et de colonnes de la deuxième matrice
		int matrix2_rows = matrix2.length;
		int matrix2_cols = matrix2[0].length;
		
		// Vérifie que les matrices ont les mêmes dimensions
		if (matrix1_rows == matrix2_rows && matrix1_cols == matrix2_cols) {
			
			// Crée une matrice vide pour stocker le résultat
			int[][] matrixResult = new int[matrix1_rows][matrix1_cols];
			
			// Boucle pour parcourir la matrice
			for(int i = 0; i < matrixResult.length; i++) {
				for(int j = 0; j < matrixResult[i].length; j++) {
					
					// Choisit l’opération à effectuer selon le paramètre "operator"
					switch(operatorSymbol) {
						case "addition":
							matrixResult[i][j] = Operation.addition(matrix1[i][j], matrix2[i][j]);
							break;
						case "subtract":
							matrixResult[i][j] = Operation.subtract(matrix1[i][j], matrix2[i][j]);
							break;
						case "multiplication":
							matrixResult[i][j] = Operation.multiplication(matrix1[i][j], matrix2[i][j]);
							break;
						case "division":
							matrixResult[i][j] = Operation.division(matrix1[i][j], matrix2[i][j]);
							break;
						default:
							return null;
					}	
				}		
			}
			// Si les dimensions correspondent on retourne la matrice générée
			return matrixResult;	
		}
		
		else {
			// Si les dimensions ne correspondent pas, on retourne null
			return null;
		}
		
	}
	
	
	/**
     * Affiche une matrice dans la console sous forme de tableau.
     * @param matrice : matrice à afficher
     */
	public static void displayMatrix(int [][] matrix) {
			for (int i = 0; i < matrix.length; i++) {
	            for (int j = 0; j < matrix[i].length; j++) {
	                System.out.print(matrix[i][j] + " ");
	            }
	            System.out.println();
			}
	}
	
	
	/**
     * Affiche deux matrices, l’opération effectuée entre elles, et le résultat (si possible).
     * @param m1 : première matrice
     * @param m2 : seconde matrice
     * @param matriceResult : résultat de l’opération
     * @param operator : symbole de l’opération ("+", "-", "*", "/")
     */
	public static void displayMatrixOperation(int [][] m1, int [][] m2, int [][] matrixResult, String operator) {
		
		// Affiche la 1ère matrice
		displayMatrix(m1);
		// Affiche la 2ème matrice
		System.out.println(operator);
		displayMatrix(m2);
		
		// Si les 2 matrices font la même taille
		if (matrixResult != null ) {
			System.out.println("=");
			// Affiche la matrice issue du résultat
			displayMatrix(matrixResult);
			System.out.println("-------------");
		}
		
		// Sinon on envoie un message d'erreur
		else {
			System.out.println("---------------------------------------------------------");
			System.out.println("Les matrices n'ont pas le même nombre de colonnes/lignes.");
			System.out.println("---------------------------------------------------------");
		}
		
	}
	
	
	// main----------------------------------------------------------------------------
	
	public static void main(String[] args) {
		int [][] m1 = {
				{10, 11, 12},
		 		{4, 5, 6},
		 		{7, 8, 9}
				};
		
		int [][] m2 = {
		 		{1, 2, 3},
		 		{7, 8, 9},
		 		{4, 5, 6}
			};		
		
		
		displayMatrixOperation(m1, m2, applyMatrixOperation(m1, m2, "addition"), "+");
		displayMatrixOperation(m1, m2, applyMatrixOperation(m1, m2, "subtract"), "-");
		displayMatrixOperation(m1, m2, applyMatrixOperation(m1, m2, "multiplication"), "*");
		
	}
}
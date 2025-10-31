class Matrice{
	
	public static int [][] operationMatrices(int [][] matrice1, int [][] matrice2, String operator) {
		// [] lignes
		// [][] colonnes
		
		int matrice1_rows = matrice1.length;
		int matrice1_cols = matrice1[0].length;
		
		int matrice2_rows = matrice2.length;
		int matrice2_cols = matrice2[0].length;
		
		if (matrice1_rows == matrice2_rows && matrice1_cols == matrice2_cols) {
			int[][] matrice = new int[matrice1_rows][matrice1_cols];
			for(int i = 0; i < matrice.length; i++) {
				for(int j = 0; j < matrice[i].length; j++) {
					switch(operator) {
						case "addition":
							matrice[i][j] = Operation.addition(matrice1[i][j], matrice2[i][j]);
							break;
						case "substract":
							matrice[i][j] = Operation.substract(matrice1[i][j], matrice2[i][j]);
							break;
						case "multiplication":
							matrice[i][j] = Operation.multiplication(matrice1[i][j], matrice2[i][j]);
							break;
						case "division":
							matrice[i][j] = Operation.division(matrice1[i][j], matrice2[i][j]);
							break;
						default:
							return null;
					}	
				}		
			}
			return matrice;	
		}
		
		else {
			return null;
		}
		
	}
	
	public static void displayMatrice(int [][] matrice) {
			for (int i = 0; i < matrice.length; i++) {
	            for (int j = 0; j < matrice[i].length; j++) {
	                System.out.print(matrice[i][j] + " ");
	            }
	            System.out.println();
			}

	}
	
	public static void displayOperation(int [][] m1, int [][] m2, int [][] matriceResult, String sign) {
		displayMatrice(m1);
		System.out.println(sign);
		displayMatrice(m2);
		
		if (matriceResult != null ) {
			System.out.println("=");
			for (int i = 0; i < matriceResult.length; i++) {
	            for (int j = 0; j < matriceResult[i].length; j++) {
	                System.out.print(matriceResult[i][j] + " ");
	            }
	            System.out.println();
			}
			System.out.println("-------------");
		}
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
		 		
			};		
		
		
		displayOperation(m1, m2, operationMatrices(m1, m2, "addition"), "+");
		displayOperation(m1, m2, operationMatrices(m1, m2, "substract"), "-");
		displayOperation(m1, m2, operationMatrices(m1, m2, "multiplication"), "*");
		
	}
}
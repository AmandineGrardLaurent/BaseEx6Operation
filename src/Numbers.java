import java.util.Arrays;

class Numbers{
	// 6.3-----------------------------------------------------------------------------
	
	public static int getMaxNumber(int [] arrayNumbers) {
		// Use a stream (IntStream) to process the array
		int maxNumber = Arrays.stream(arrayNumbers) 
	                .max()           
	                .getAsInt();     

		return maxNumber;
	}
		
	public static int [] deleteNumber(int [] arrayNumbers, int numberToDelete) {
		int [] newArray = Arrays.stream(arrayNumbers)
					.filter(nb -> nb != numberToDelete)
					.toArray();
		return newArray;
	}
		
	public static void sum2MaxNumbers(int [] arrayNumbers) {
		int nbMax1 = getMaxNumber(arrayNumbers);
		arrayNumbers = deleteNumber(arrayNumbers, nbMax1);
		int nbMax2 = getMaxNumber(arrayNumbers);
		System.out.println(Operation.addition(nbMax1, nbMax2));
	}
		
		
	// main----------------------------------------------------------------------------
		
	public static void main(String[] args) {
		int [] arrayNumbers = {1, 2, 5, 7, 10};
			
		sum2MaxNumbers(arrayNumbers);
			
	}
}
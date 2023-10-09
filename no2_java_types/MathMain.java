public class MathMain {
	public static void main(String[] args) {
		
		int begin = 2;
		int end = 10;
		
		long sum = getSumBetween(begin, end);
		System.out.printf("Sum between %d and %d : %,d%n", begin, end, sum);
		printSumBetween(begin, end, sum);

		long product = getProductBetween(begin, end);
		System.out.printf("Product between %d and %d : %,d%n", begin, end,
			product);
		printProductBetween(begin, end, product);
	}
    
	public static long getSumBetween(int begin, int end) {
		long result=0;
		for(int i=begin; i<=end; i++) result += i;
		return result;
	}
	public static long getProductBetween(int begin, int end) {
		long result = 1;
		for(int i= begin; i<=end;i++) result *= i;
		return result;
	}
	
	public static void printSumBetween(int begin, int end, long result) {
		for(int i=begin; i<=end-1; i++)
			System.out.printf("%d+", i);
		System.out.printf("%d = %d%n", end , result);
	}
	public static void printProductBetween(int begin, int end, long result) {
		for(int i=begin; i<=end-1; i++)
			System.out.printf("%d*", i);
		System.out.printf("%d = %,d%n", end , result);
	}
}
package Week8;

public class BigO {

	public static void main(String[] args) {
		
		// Time difference when x is 100
		int x = 10;
		bigOLoopSuite(x);
		// Time difference when x is 10000
		x = 100;
		bigOLoopSuite(x);
		// Time difference when x is 1000000
		x = 1000;
		bigOLoopSuite(x);
	}
	
	public static void bigOLoopSuite(int x) {
		bigO1Loop(x);
		bigO2Loop(x);
		bigO3Loop(x);
	}
	
	// This method has a big O complexity of 1
	public static void bigO1Loop(int x) {

		long startTime = System.nanoTime();
		for(int i = 0; i < x; i ++) {
			// iterate x times
		}
		long finTime = System.nanoTime();
		
		long totalTime = finTime - startTime;
		System.out.println("When x = " + x + ", BigO of 1 complexity takes " + totalTime + " nanoseconds");
		
	}
	
	// this method has a big O complexity of 2
	public static void bigO2Loop(int x) {

		long startTime = System.nanoTime();
		for(int i = 0; i < x; i ++) {
			// iterate x times
			for(int j = 0; j < x; j ++) {
				// iterate x times
			}
		}
		long finTime = System.nanoTime();
		
		long totalTime = (long)(finTime - startTime);
		System.out.println("When x = " + String.valueOf(x) + ", BigO of 2 complexity takes " + totalTime + " nanoseconds");
		
	}
	
	// this method has a big O complexity of 3
	public static void bigO3Loop(int x) {
		long startTime = System.nanoTime();
		for(int i = 0; i < x; i ++) {
			// iterate x times
			for(int j = 0; j < x; j ++) {
				// iterate x times
				for(int k = 0; k < x; k ++) {
					// iterate x times
					int op = k;
				}
			}
		}
		
		long finTime = System.nanoTime();
		long totalTime = finTime - startTime;
		System.out.println(finTime);
		System.out.println(startTime);
		System.out.println("When x = " + String.valueOf(x) + ", BigO of 3 complexity takes " + Long.toString(totalTime) + " nanoseconds");
	
	}
}

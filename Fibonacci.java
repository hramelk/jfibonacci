import java.math.BigInteger;
import java.util.Vector;

public class Fibonacci {
	
	private static Vector<BigInteger>	fibonacciList;
	private static boolean				initialised	= false;
	
	public static Vector<BigInteger> getFibonacciList() {
		return fibonacciList;
	}
	
	public static BigInteger getFibonacciNumberAt(int index) {
		
		if (initialised) {
			// check if the number need to be computed
			if (index >= fibonacciList.size()) {
				findNumberAt(index);
			}
		} else {
			// initialise
			initialise();
			initialised = true;
		}
		
		return fibonacciList.elementAt(index);
		
	}
	
	private static void initialise() {
		// fibonacciList = new Vector<Long>(2, 1);
		fibonacciList = new Vector<BigInteger>();
		fibonacciList.add(BigInteger.ZERO);
		fibonacciList.add(BigInteger.ONE);
	}
	
	private static void findNumberAt(int index) {
		// System.out.println("Computing index: " + index);
		
		for (int i = fibonacciList.size(); i <= index; i++) {
			BigInteger newNumber = fibonacciList.elementAt(i - 1).add(
					fibonacciList.elementAt(i - 2));
			fibonacciList.add(newNumber);
		}
	}
	
}

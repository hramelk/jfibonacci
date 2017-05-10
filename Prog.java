import java.math.BigInteger;

public class Prog {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BigInteger number0 = Fibonacci.getFibonacciNumberAt(0);
		BigInteger number1 = Fibonacci.getFibonacciNumberAt(1);
		BigInteger number3 = Fibonacci.getFibonacciNumberAt(50);
		
		// the biggest Fibonacci number a Long can hold
		BigInteger number4 = Fibonacci.getFibonacciNumberAt(92);
		// Long can't hold the next value anymore
		BigInteger number5 = Fibonacci.getFibonacciNumberAt(93);
		
		// BigInteger can hold the next value
		BigInteger number6 = Fibonacci.getFibonacciNumberAt(1150);
		// the biggest Fibonacci number I have tried
		BigInteger number7 = Fibonacci.getFibonacciNumberAt(1152);
		
		System.out.println(number0);
		System.out.println(number1);
		System.out.println(number3);
		System.out.println(number4);
		System.out.println(number5);
		System.out.println(number6);
		System.out.println(number7);
		
		System.out.println();
		System.out.println();
		
		/*
		 * Vector<BigInteger> fullList = Fibonacci.getFibonacciList(); for (int
		 * i = 0; i < fullList.size(); i++) { System.out.println(i + " : " +
		 * fullList.elementAt(i)); if
		 * (fullList.elementAt(i).compareTo(BigInteger.ZERO) == -1) break; }
		 */
		
		/*
		 * for (int i = 0; true; i++) { BigInteger temp =
		 * Fibonacci.getFibonacciNumberAt(i); System.out.println(i + " : " +
		 * temp);
		 * 
		 * if (temp.compareTo(BigInteger.ZERO) == -1) break; }
		 */
		
	}
}

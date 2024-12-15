package lab6;

public class DemoOverLoading {

	public static void main(String[] args) {
		OverLoading o1 = new OverLoading();
		
		int[] intArray= {1,5,2,3,9}; 
		System.out.println("Sum of integer Array: "+o1.sum(intArray));
		
		String [] stringArray= {"My "+"name "+"is "+"Hadi"};
		System.out.println("Sum of String Array: "+o1.sum(stringArray));
		
		char[] charArray = {'H','A','D','I'};
		System.out.println("Sum of Char Array: "+o1.sum(charArray));
		
		double[] doubleArray = {2.3, 7.1, 9.2, 5.5};
		System.out.println("Sum of Double Array: "+o1.sum(doubleArray));

	}

}


public class Main {

	public static void main(String[] args) {
		
		Calculator clsCalc = new Calculator();
		int intReturn;
		float floatReturn;
		
		intReturn = clsCalc.add(4, 5);
		System.out.println(intReturn);
		
		intReturn = clsCalc.sub(10, 2);
		System.out.println(intReturn);
		
		floatReturn = clsCalc.div(10, 2);
		System.out.println(floatReturn);
		
		intReturn = clsCalc.mult(10, 2);
		System.out.println(intReturn);

	}

}

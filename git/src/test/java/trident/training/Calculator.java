package trident.training;

public class Calculator {
	
	public int add (int a , int b) {
		return a+b;
	}
	
	public double add (double a , double b) {
		return a+b;
	}
	
	public int mul (int a, int b) {
		return a*b;
	}

	public static void main(String[] args) {
    Calculator c1 = new Calculator();
    int a  = c1.add(2, 03);
   System.out.println(a); 
   
   int b = c1.mul(12, 23);
   System.out.println(b);
	}

}

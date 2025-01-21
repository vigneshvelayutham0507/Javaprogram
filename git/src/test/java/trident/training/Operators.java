package trident.training;

public class Operators {

	public static void main(String[] args) {
		int a = 100, b = 50;  
		
		int sum = a + b; // addition 
        System.out.println("a+b is " + sum); 
  
        int sub = a - b; // subtraction 
        System.out.println("a-b is " + sub); 
  
        int mul = a * b; // multiplication 
        System.out.println("a*b is " + mul); 
  
        int div = a / b; // division 
        System.out.println("a/b is " + div); 
  
        int mod = a % b; // modulus 
        System.out.println("a%b is " + mod); 
       //unary operator 
        a++;
        b--;
        
        System.out.println(a++);
        System.out.println(b--);

	}

}

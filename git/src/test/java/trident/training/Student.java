package trident.training;

public class Student {
	int marks;
	String name;
	
	Student(int a,String b){
		marks = a;
		name = b;
		
		//System.out.println("hello");
	}

	public static void main(String[] args) {
		Student ob1 = new Student (44, "david");
		System.out.println(ob1.marks);
		

	}

}

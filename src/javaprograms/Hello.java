package javaprograms;

class A{
	int a=1;
	int b=1;
	A(){
		this(2,2);
		System.out.println(a+b);
		}
	//parameteriased constructor
	A(int i,int j){
		this(2,2,2);
		a=i;
		b=j;
		System.out.println(a+b);
		
	}
	A(int i,int j,int k){
		a=i;
		b=j;
		int c=k;
		System.out.println(a+b+c);
	}
}

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println("hello");
//		System.out.println("hello charan");
		int a=10;
		System.out.println("sau");
		Hello H1= new Hello();
		//A o=new A(2,2);
		A i=new A();
		//A d=new A(2,2,2);
		
	}

}

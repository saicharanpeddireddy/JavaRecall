package javaprograms;

class outter{
	void outermethod() {
		System.out.println("this is a method of outer class ");
		}
	class inner{
		void method() {
		System.out.println(" this is a inner class method");
		}
	}
}




public class Innerclases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outter i=new outter();
		outter.inner ob=i.new inner();
		ob.method();
		

	}

}

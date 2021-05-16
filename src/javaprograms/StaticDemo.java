package javaprograms;

 class ob{
	 int a;
	static int i=1000;
	public static void A(){
		System.out.println("This is a Static method");
	}
public void ls(int l){
		System.out.println("hi");
	}
static {
	System.out.println("STATIC BLOCK");
}
 }

public class StaticDemo {

	public static void Me() {
	int f=200000;
	System.out.println("  static mian"+f);
	}
	public static void main(String[] args) {
		StaticDemo S1= new StaticDemo();
		
		StaticDemo.Me();
		ob d=new ob();
		d.A();//by object
		ob.A();//by class name
		System.out.print(ob.i);
		d.ls(10);
		}

}

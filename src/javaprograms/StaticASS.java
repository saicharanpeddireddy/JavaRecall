package javaprograms;
/*student i ,name
 * school name group 
 * 
 */
class Student{
	int id;
	String S;
	
	static String C;
	static{
		 C="Anurag";
		}
	static Void show(){
		System.out.println("   SChool "+C);
		return null;
	}
	
}

public class StaticASS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student ob=new Student();
		ob.id=585;
		ob.S="charan";
		ob.show();
		Student m=new Student();
		m.id=586;
		m.S="ram";
		m.show();

	}

}

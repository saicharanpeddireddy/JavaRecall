package javaprograms;
class Add{
	public int Mul(int ... n){
		int Total=1;
		for(int k : n) {
			Total=Total*k;
					}
		return Total;
		
	}
}

public class Varargs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s;
		Add A=new Add();
		s=A.Mul(1,2,3);
		System.out.println(s);

	}

}

package javaprograms;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {12,3,4};
		
		
		int a[][]= {
				{1,2,3},
				{11,22,33},{111,222,333}
		};
		for(int i[]:a) {
			for(int k : i) {
				System.out.print(" "+k);
			}
			System.out.println();
			
		}
//				[ 1,2,3]
//				[11,22,33]
//				[111,222,333]
//		
	}

}
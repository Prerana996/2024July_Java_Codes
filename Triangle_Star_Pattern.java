//Print below star pattern:
//
//     * 
//    * * * 
//  * * * * * 
//* * * * * * * 

package Basic;

public class Triangle_Star_Pattern {

	public static void main(String[] args) {
//     	int n=4;
		// TODO Auto-generated method stub
		for(int i=0;i<4;i++) {
			for(int j=0;j<4-i-1;j++) {
				System.out.print(" "+" ");
			}
			// j<2*1+1/j<=i+i
			for(int j=0;j<=2*i;j++) {
				System.out.print("*"+" ");
			}
		
		System.out.println();
	}

	}

}

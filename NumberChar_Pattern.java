//Print below pattern
//1 B 3 C 
//5 D 7 E 
//9 F 11 G 
//13 H 15 I 

package Basic;

public class NumberChar_Pattern {
	public static void main(String[] args) {
		char alpha = 'B';
		int a = 1;
		for(int i=0;i<=3;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(a+" "+(char)(alpha+i*2+j)+" ");
				a=a+2;
			}
			System.out.println();
		}
	}

}

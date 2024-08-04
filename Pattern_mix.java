//Number and alphabets mix Pattern no.2
//
//A 6 F 16 K 
//B 7 G 17 L 
//C 8 H 18 M 
//D 9 I 19 N 
//E 10 J 20 O 
package Basic;

public class Pattern_mix {
	public static void main(String[] args) {
		System.out.println("Number and alphabets mix Pattern no.2\n");
		
		char mainAlpha = 'A';
		int mainNum = 1;
		for(int i=1;i<=5;i++) {
			char alpha = mainAlpha;
			int num = mainNum;
			for(int j=1;j<=5;j++) {
				if(j%2==0) {
					System.out.print(num+5+" ");
					num=num+(5*j);
					alpha+=5;
				}else {
					System.out.print(alpha+" ");
				}
			}
			mainAlpha++;
			mainNum++;
			System.out.println();
		}	
	}

}

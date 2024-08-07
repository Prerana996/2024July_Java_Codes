package ArrayCodekul;
import java.util.Arrays;

public class Missing_num {
	public static void main(String[] args) {
	int[] a={11,13,15,14};
	Arrays.sort(a);
	
	
	for(int i=1;i<a.length;i++){
		if(a[i]-a[i-1]==1) {
			}else {
				System.out.println("Missingnumber is : "+(a[i-1]+1));
			}
	}

}
}

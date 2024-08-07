package ArrayCodekul;

public class Missing_Number {
	public static void main (String[] args) {
		int[] a = {1,2,5,4,6};
		int sum=(a.length+1)*(a.length+2)/2;
		for(int i=0;i<a.length;i++) {
			sum=sum-a[i];
		}
		System.out.println("Missing Number : "+sum);
	}

}

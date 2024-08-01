package Basic;

public class Count_Even_Odd {
	
	public static void main(String[] args) {
		
		int a = 87861;
		int count = 0;

	   for(int s = a; s > 0; s = s / 10)
		{

			 
			 count++;

		}
	   System.out.println("Count:"+count);

		if(count%2==0) {
			System.out.println("Even Count.");
		}else {
			
			System.out.println("Odd Count."+count*2);
			
			
		}
	}

}

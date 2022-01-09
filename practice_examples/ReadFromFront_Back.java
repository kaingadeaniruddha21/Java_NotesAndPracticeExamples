package practice_examples;


public class ReadFromFront_Back {

	public static void main(String[] args) {
		int [] a = {1,2,3,4,4,3,2,1};
		boolean read = true;
		int j = a.length-1;
		
		for(int i=0;i<a.length/2;i++) {
			if(a[i] != a[j]) {
				read = false;
			}
			else 
				j--;
		
		}
		
		System.out.println(read);
	}
}





package practice_examples;

public class RemoveWhiteSpace {

	public static void main(String[] args) {

		String s = "abc xyz abc xyz abc";
		
		//regex is used to spaceess
		
		s= s.replaceAll("\\s+","");
		
	//	s=s.replace("a","q");
		
		System.out.println("String after removing white spaces:"+s);
	}

}

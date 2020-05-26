package binaryTools;

public class CommonTermGenerator {

	public static String generate(String boolean1, String boolean2){
		String commonTerm = "";

		char[] bool1charArray = boolean1.toCharArray();
		char[] bool2charArray = boolean2.toCharArray();
		for (int i = 0; i < bool1charArray.length; i++) {
			if(bool1charArray[i]!=bool2charArray[i]){
				commonTerm=commonTerm+"-";
			}
			else{
				commonTerm=commonTerm+bool1charArray[i];
			}
		}		
		return commonTerm;
	}

	public static void main(String[] args) {
		System.out.println(generate("0101", "0001"));
	}

}

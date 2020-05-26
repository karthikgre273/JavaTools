package binaryTools;

public class CheckForSimilarityInWeights {

	public static boolean check(String boolean1, String boolean2){
		char[] bool1charArray = boolean1.toCharArray();
		char[] bool2charArray = boolean2.toCharArray();
		int changes=0;
		for (int i = 0; i < bool1charArray.length; i++) {
			if(bool1charArray[i]!=bool2charArray[i]){
				changes++;
				if(changes==2){
					return false;
				}
			}
		}		
		if(changes==1){
			return  true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(check("011", "100"));

	}
}	

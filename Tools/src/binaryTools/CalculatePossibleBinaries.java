package binaryTools;

import java.util.ArrayList;

public class CalculatePossibleBinaries {

	public static ArrayList<String> getBinaryTerms(ArrayList<String> reducedMinTerms) {
		ArrayList<String> returnList=new ArrayList<>();
		for (String term : reducedMinTerms) {
			returnList.addAll(getBinaryTerms(term));
		}

		return returnList;
	}

	public static ArrayList<String> getBinaryTerms(String term) {
		ArrayList<String> returnList=new ArrayList<>();
		if(term.contains("-")){
			int numberOfVariables=getNumberOfVariables(term);
			int numberOfPossibilities=(int)Math.pow(2, numberOfVariables);
			for (int i = 0; i < numberOfPossibilities; i++) {
				returnList.add(replaceDashes(term,AddAdditionalZeros.addAdditionalZeroes(numberOfVariables,Integer.toBinaryString(i))));	
			}
		}
		else{
			returnList.add(term);
		}
		return returnList;
	}

	private static String replaceDashes(String term, String termPossiblity) {
		char[] termArray = term.toCharArray();
		ArrayList<Integer> DashLocations= getDashLoations(term);
		char[] possibilityArray = termPossiblity.toCharArray();
		for (int i = 0; i < possibilityArray.length; i++) {
			termArray[DashLocations.get(i)]=possibilityArray[i];
		}
		return String.valueOf(termArray);
		
	}

	private static ArrayList<Integer> getDashLoations(String term) {
		ArrayList<Integer> dashLocations=new ArrayList<>();
		char[] charArray = term.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i]=='-'){
				dashLocations.add(i);
			}
		}
		
		return dashLocations;
	}

	private static int getNumberOfVariables(String term) {
		return (term.length())-(term.replace("-", "").length());
	}
	
	public static void main(String[] args) {
		System.out.println(getBinaryTerms("-001--"));
	}

}

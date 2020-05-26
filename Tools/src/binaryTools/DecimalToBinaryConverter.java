package binaryTools;

import java.util.ArrayList;

public class DecimalToBinaryConverter {

	public static ArrayList<String> convert(ArrayList<Integer> minTerms){
		ArrayList<String> returnList = new ArrayList<>();
		
		for (int term : minTerms) {
			returnList.add(Integer.toBinaryString(term));
		}
		return returnList;
	}


	
	public static void main(String[] args) {
		ArrayList<Integer> inputarray=new ArrayList<>();
		inputarray.add(14);
		inputarray.add(5);
		inputarray.add(6);
		inputarray.add(7);

		ArrayList<String> output=convert(inputarray);
		for (int i=0;i<inputarray.size();i++) {
			System.out.println("input : "+inputarray.get(i)+" :: output :"+output.get(i));
		}	

	}

}

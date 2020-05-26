package sortingAlgorithm;

import java.util.ArrayList;
import java.util.HashMap;

import binaryTools.DecimalToBinaryConverter;
import binaryTools.NumberOfOnesCalculator;

public class SortAccordingToWeights {

	public static HashMap<Integer, ArrayList<String>> sort(ArrayList<String> minTermsInBinary){	


		HashMap<Integer, ArrayList<String>> returnMap=new HashMap<>();
		for (String term : minTermsInBinary) {
			int NumberOfOnes=NumberOfOnesCalculator.calculate(term);
			if (!returnMap.containsKey(NumberOfOnes)) {
				returnMap.put(NumberOfOnes, new ArrayList<>());		
			}	
			ArrayList<String> arrayList = returnMap.get(NumberOfOnes);
			arrayList.add(term);
		}


		return returnMap;

	}

	public static void main(String[] args) {

		ArrayList<Integer> inputarray=new ArrayList<>();
		inputarray.add(63);
		inputarray.add(31);
		inputarray.add(15);
		inputarray.add(14);
		inputarray.add(5);
		inputarray.add(6);
		inputarray.add(7);
		inputarray.add(0);
		inputarray.add(1);

		ArrayList<String> output=DecimalToBinaryConverter.convert(inputarray);
		HashMap<Integer, ArrayList<String>> sortedOutPut = sort(output);
//		for (int i=0;i<inputarray.size();i++) {
//			System.out.println("input : "+inputarray.get(i)+" :: output :"+output.get(i));
//		}	
		System.out.println("with 6 1's : "+sortedOutPut.get(6));
		System.out.println("with 5 1's : "+sortedOutPut.get(5));
		System.out.println("with 4 1's : "+sortedOutPut.get(4));
		System.out.println("with 3 1's : "+sortedOutPut.get(3));
		System.out.println("with 2 1's : "+sortedOutPut.get(2));
		System.out.println("with 1 1's : "+sortedOutPut.get(1));
		System.out.println("with 0 1's : "+sortedOutPut.get(0));
		
	
	}
}

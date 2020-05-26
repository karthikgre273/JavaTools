package binaryTools;

import java.util.ArrayList;
import java.util.HashMap;

public class AddAdditionalZeros {

	public static HashMap<Integer, ArrayList<String>> compute(int numberOfBits,HashMap<Integer, ArrayList<String>> inputMap){
		HashMap<Integer, ArrayList<String>> returnMap=new HashMap<>();
		Object[] keySet = inputMap.keySet().toArray();
		for (int i = 0; i < inputMap.size(); i++) {
				for (int j = 0; j < inputMap.get(keySet[i]).size(); j++) {
					String computedTerm = addAdditionalZeroes(numberOfBits,inputMap.get(keySet[i]).get(j));
					if (!returnMap.containsKey(keySet[i])) {
						returnMap.put((Integer) keySet[i], new ArrayList<>());		
					}
					returnMap.get(keySet[i]).add(computedTerm);
				}
		}
		return returnMap;

	}
	
	public static ArrayList<String> compute(int numberOfBits, ArrayList<String> inputlist){
		ArrayList<String> returnMap=new ArrayList<>();
		for (String string : inputlist) {
					returnMap.add(addAdditionalZeroes(numberOfBits,string));
				}
		return returnMap;

	}

	public static String addAdditionalZeroes(int numberOfBits,String string) {
		String returnString=string;
		while(returnString.length()<numberOfBits){
			returnString="0"+returnString;
		}	
		return returnString;
	}

	public static void main(String[] args) {
		String a="01";
		String returnString = addAdditionalZeroes(10, a);
		System.out.println(returnString);
	}
}

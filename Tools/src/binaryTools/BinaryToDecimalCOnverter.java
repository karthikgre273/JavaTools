package binaryTools;

import java.util.ArrayList;

public class BinaryToDecimalCOnverter {
	
	public static ArrayList<Integer> convert(ArrayList<String> datainBinary){
		ArrayList<Integer> returnList=new ArrayList<>();
		for (String binary : datainBinary) {
			returnList.add(convert(binary));
		}
		
		return returnList;
	}

	public static Integer convert(String binary) {
		return Integer.parseInt(binary, 2);
	}
	
	public static void main(String[] args) {
		System.out.println(convert("0111"));
	}

}

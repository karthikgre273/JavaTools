package binaryTools;

import java.util.ArrayList;
import java.util.Collections;

public class NumberOfBitsCalculator {
	
	public static int getNumberOfBits(ArrayList<Integer> minTermsInDecimals) {
		int maxTerm=Collections.max(minTermsInDecimals);
		int i=0;
		while(true){
			if(Math.pow(2, i)>=maxTerm){
				return i;
			}
			i++;
		}
	}
	
	public static int getNumberOfBits(String minTermsInBinary) {
		return minTermsInBinary.length();
		
	}
}

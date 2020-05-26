package binaryTools;

public class NumberOfOnesCalculator {

	public static int calculate(String term) {;

	int numberof1s = term.length() - term.replaceAll("1", "").length();
	return numberof1s;
	}

	public static int calculate(int term) {;
	int count=0;
	while (term!=0)
	{
		term &= (term -1) ;
		count++;
	}
	return count;
	}

}

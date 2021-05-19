import java.util.*;
public class pairCount {

	public static int pairs(String sentence) {
		int pairCount = 0;
		char[] ch = sentence.toCharArray();
		for(int i = 0; i<sentence.length()-1; i++)
		{
			if(ch[i] == ch[i+1])
			{
				pairCount++;
			}	
		}
		return pairCount;
	}
}


public class sequenceCount {

	public int count(String numbers)
	{
		int sixCount = 0;
		String ones = "11";
		char[] ch = numbers.toCharArray();
		char six = '6';
		int index = numbers.indexOf(ones);
		if(index == -1)
		{
			System.out.println("There is no sequence of two 1s in a row");
		}
		else
		{
			System.out.println("There is a sequence of two 1s in a row");
		}
		for(int i = 0; i < numbers.length(); i++)
		{
			if(ch[i] == six)
			{
				sixCount++;
			}
		}
		
		return sixCount;
	}

}


public class MainTest {
	public static void main (String [] args)
	{
		pairCount test = new pairCount();
		sequenceCount trial = new sequenceCount();
		int output1 = test.pairs("silly assignments"); 
		//expected output is 2
		System.out.println(output1);
		int output2 = test.pairs("Hello sunny day, goodnight moon");
		//expected output is 4
		System.out.println(output2);
		int output3 = trial.count("1234561125214163611");
		//expected output is 3
		System.out.println(output3);
		int output4 = trial.count("11   5  53  57   6  43  46  23  12   4");
		System.out.println(output4);
	}
}

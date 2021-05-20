import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class sequenceCountTest {

	@Test
	void test() {
		sequenceCount test = new sequenceCount();
		int result = test.count("1234561125214163611");
		int output = test.count("11   5  53  57   6  43  46  23  12   4");
		assertEquals(3,result);
		assertEquals(2,output);
	}

}

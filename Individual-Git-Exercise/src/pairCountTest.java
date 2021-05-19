import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class pairCountTest {

	@Test
	void test() {
		pairCount test = new pairCount();
		int result1 = test.pairs("silly assignments");
		int result2 = test.pairs("Hello sunny day, goodnight moon");
		assertEquals(2, result1);
		assertEquals(4, result2);
	}

}

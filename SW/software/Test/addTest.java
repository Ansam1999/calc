import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class addTest {

	@Test
	void test() {
		Add obj = new Add();
		int res = obj.add(2, 5);
		assertEquals(7,res);
	}

}

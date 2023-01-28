import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SizeTestStudent {
	@BeforeEach
	void setUp() throws Exception {
	}
	
		

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	void test() {
		assertEquals(Size.LARGE, Size.LARGE);
	}

}

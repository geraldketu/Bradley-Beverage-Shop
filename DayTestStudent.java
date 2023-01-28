import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DayTestStudent {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}
	
	

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	

	@AfterEach
	void tearDown() throws Exception {
	}


	@Test
	void test() {
		assertEquals(Day.MONDAY, Day.MONDAY);
	}
	
	@BeforeEach
	void setUp() throws Exception {
	}

}

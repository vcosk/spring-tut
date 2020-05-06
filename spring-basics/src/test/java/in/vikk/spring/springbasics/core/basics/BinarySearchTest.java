package in.vikk.spring.springbasics.core.basics;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import in.vikk.spring.springbasics.core.SpringIn5StepsBasicsApplication;

// Set test runner
@RunWith(SpringRunner.class)
// Load the context.
@ContextConfiguration(classes=SpringIn5StepsBasicsApplication.class)
public class BinarySearchTest {

	// Load bean from the context.
	@Autowired
	private BinarySearchImpl binarySearch;
	
	@Test
	public void testBinarySearch() {
		int actualResult = binarySearch.binarySearch(new int[]{}, 6);
		assertEquals(3,actualResult);
	}

}

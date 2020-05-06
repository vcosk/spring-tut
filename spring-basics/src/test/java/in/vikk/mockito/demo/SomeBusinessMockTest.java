package in.vikk.mockito.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessImpl;
	
	@Test
	public void testFindGreatestNumber() {
		when(dataServiceMock.retriveData()).thenReturn(new int[] {3,1,67,43,99,123,42});
		
		int result = businessImpl.findGreatestNumber();
		assertEquals(123,result);
	}
}
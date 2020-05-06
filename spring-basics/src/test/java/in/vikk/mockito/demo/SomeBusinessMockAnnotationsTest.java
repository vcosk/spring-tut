package in.vikk.mockito.demo;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class SomeBusinessMockAnnotationsTest {
	
	@Test
	public void testFindGreatestNumber() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retriveData()).thenReturn(new int[] {3,1,67,43,99,123,42});
		
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(dataServiceMock);
		int result = businessImpl.findGreatestNumber();
		assertEquals(123,result);
	}
}
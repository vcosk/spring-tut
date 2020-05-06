package in.vikk.mockito.demo;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListMockTest {
	
	@Mock
	List<String> listMock;
	
	@Test
	public void testReturnSizes() {
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10, listMock.size());
		assertEquals(20, listMock.size());
		assertEquals(20, listMock.size());
	}
	
	@Test
	public void testReturnWithParams() {
		when(listMock.get(0)).thenReturn("Impu");
		assertEquals("Impu", listMock.get(0));
		assertEquals(null, listMock.get(1));
	}
	
	@Test
	public void testReturnWithAnyParams() {
		when(listMock.get(Mockito.anyInt())).thenReturn("Impu");
		assertEquals("Impu", listMock.get(0));
		assertEquals("Impu", listMock.get(1));
	}
}

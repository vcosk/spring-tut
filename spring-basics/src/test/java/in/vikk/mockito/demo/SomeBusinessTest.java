package in.vikk.mockito.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeBusinessTest {

	@Test
	public void testFindGreatestNumber() {
		SomeBusinessImpl businessImpl = new SomeBusinessImpl(new DataServiceStub());
		businessImpl.findGreatestNumber();
	}
}

class DataServiceStub implements DataService {

	@Override
	public int[] retriveData() {
		return new int[] {3,1,67,43,99,123,42};
	}
}
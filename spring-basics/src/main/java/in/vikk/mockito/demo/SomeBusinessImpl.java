package in.vikk.mockito.demo;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findGreatestNumber() {
		int[] data = dataService.retriveData();
		int greatest = Integer.MIN_VALUE;
		for (int i : data) {
			if (greatest < i) {
				greatest = i;
			}
		}
		return greatest;
	}
}

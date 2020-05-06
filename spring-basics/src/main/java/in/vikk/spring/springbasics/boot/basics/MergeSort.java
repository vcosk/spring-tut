package in.vikk.spring.springbasics.boot.basics;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merge")
public class MergeSort implements SortAlgorithm {
	@Override
	public void sort(int[] data) {
		System.out.println("Merge Sort");
	}
}

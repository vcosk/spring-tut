package in.vikk.spring.springbasics.boot.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSort implements SortAlgorithm {
    @Override
    public void sort(int[] data) {
        // Sorts with Quick Sort.
    	System.out.println();
    }
}

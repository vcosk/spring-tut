package in.vikk.spring.springbasics.core.basics;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BubbleSort implements SortAlgorithm {
    @Override
    public void sort(int[] data) {
    	System.out.println("Bubble Sort");
        // Sorts data with bubble sort.
    }
}

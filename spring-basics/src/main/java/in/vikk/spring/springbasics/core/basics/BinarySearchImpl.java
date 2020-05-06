package in.vikk.spring.springbasics.core.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// Creates a new instances every time bean is looked up.
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl {

	// - When a qualifier name is not specified for a component,
	// 	 the class name will be used a a qualifier name.
	// - Unlike name based auto wiring, when using @Qualifier,
	//   @Primary does not override the configuration.
	@Autowired
//	@Qualifier("mergeSort")
	@Qualifier("merge")
	private SortAlgorithm sortAlgorithm;
	
    // private SortAlgorithm sortAlgorithm;
	@Autowired
	private SortAlgorithm quickSort;
    
	// When @Primary is used in a component bean, name based auto wiring is no longer supported.
	// If QuickSort is set as primary bean, bubble sort bean will not mapped.
	// We can't have more than one primary bean for a given type.
	@Autowired
	private SortAlgorithm bubbleSort;

    // Dependency injection.
    // Bean is initialized with constructor.
	// When using constructor for named auto wiring, argument name should match the bean name.
	// Both quickSort and bubbleSort will point to QuickSort when @Primary is used in QucikSort.
    public BinarySearchImpl(SortAlgorithm quickSort, @Qualifier("bubbleSort") SortAlgorithm bubbleSort,
    		SortAlgorithm mergeSort, SortAlgorithm merge, @Qualifier("merge") SortAlgorithm mergeSortObj) {
        this.quickSort = quickSort;
        this.bubbleSort = bubbleSort;
        
        System.out.println("Quick sort" + quickSort);
        System.out.println("Bubble sort" + this.bubbleSort);
        // Wired to Primary - Quick sort
        System.out.println("Merge sort with bean name" + mergeSort);
        // Wired to Primary - Quick sort
        System.out.println("Merge sort with qualifier name" + merge);
        // Wired to Qualifier - Merge sort
        System.out.println("Merge sort with annotation" + mergeSortObj);
    }

    public SortAlgorithm getSortAlgorithm() {
		return sortAlgorithm;
	}

	public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}

	public int binarySearch(int[] data, int searchNumber) {
        sortAlgorithm.sort(data);
        System.out.println("Sorted data with " + sortAlgorithm);
        return 3;
    }
}

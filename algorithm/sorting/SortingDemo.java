package sorting;
import java.util.Random;

public class SortingDemo {
	
	static final int NUM_SCALE = 10000;
    public static void prepare(int A[]) {
    	for(int i=0; i<A.length; i++) {
    		A[i] = (int)(NUM_SCALE*Math.random()); 
    	}
    }
    public void prepare_Gaussian(int A[]) {
    	for(int i=0; i<A.length; i++) {
    		Random number = new Random();
    		A[i] = (int)(NUM_SCALE*number.nextGaussian()); 
    	}
    }
    public static void printA(int A[]) {
    	for(int i=0; i<A.length; i++) {
    		System.out.println(A[i]);
    	}
    }
    
    static final int SIZE = 10;    // 원래 소스에서 30이던 것을 10으로 줄임  by 최정훈
    public static void main(String[] args) {
		int[] A = new int[SIZE];
		System.out.println("Sorting Demo!");

	    prepare(A);
		System.out.println("------Before Sorting------");
		printA(A);  // print initial array
	    Sorting s = new Sorting(A);

	    s.selectionSort();
	    //s.bubbleSort();
	    //s.insertionSort(); 

		//s.mergeSort(); 
	    //s.quickSort(); 
	    //s.heapSort(); 
	    //s.shellSort(); 

		//s.radixSort(); 
	    // A = s.countingSort(NUM_SCALE); 
	    //s.bucketSort(); 
	    
		System.out.println("------After Sorting------");
		printA(A);  // print sorted array
    }
} // 코드 9-2


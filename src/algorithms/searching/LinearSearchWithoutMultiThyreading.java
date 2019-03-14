package algorithms.searching;

import java.time.Duration;
import java.time.Instant;

public class LinearSearchWithoutMultiThyreading {
	public static void main(String[] args) {
		Instant first = Instant.now();
		int[] arr={1, 5, 7, 10, 12, 14, 15, 18, 20, 22, 25, 27, 30, 64, 110, 220};
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==20) {
				System.out.println("Found x at index "+i);
			}
		}
		
		Instant sec = Instant.now();
		System.out.println(Duration.between(first, sec).getNano());
	}
}

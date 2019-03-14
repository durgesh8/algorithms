package algorithms.searching;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LinearSearchUsingMultiThreading {

	public static void main(String[] args) {
		int[] arr={1, 5, 7, 10, 12, 14, 15, 18, 20, 22, 25, 27, 30, 64, 110, 220};
		int noOfThreads=5;
		int x=20;
		findElement(noOfThreads, x, arr);
	}
	
	public static void findElement(int numberOfThreads, int x, int[] a) {
		Instant first = Instant.now();
		int sizeOfa=a.length;
		int range=sizeOfa/numberOfThreads;
		for(int i=0;i<numberOfThreads;i++) {
			Thread th;
			if(i==numberOfThreads-1) {
				 th=new Thread(new SearchThread(x, i*range, sizeOfa-1, a));
			}else {
				th=new Thread(new SearchThread(x, i*range, i*range+range-1, a));
			}
		  th.start();
		}
		Instant seconf = Instant.now();
	 System.out.println(Duration.between(first, seconf).getNano());
	}
	
	
}

class SearchThread implements Runnable{

	private int intToFind;
	private int startIndex;
	private int endIndex;
	private int[] arrayToSearchIn;
	
	public SearchThread(int x,int s,int e, int[] a) {
		intToFind= x;
		startIndex = s;
		endIndex = e;
		arrayToSearchIn= a;
	}
	
	
	@Override
	public void run() {
		for(int i=startIndex;i<=endIndex;i++) {
			if(arrayToSearchIn[i]==intToFind)
				System.out.println("Found x at index "+i);
		}
	}
	
}

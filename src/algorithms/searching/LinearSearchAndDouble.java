package algorithms.searching;

public class LinearSearchAndDouble {

	public static void main(String[] args) {
		int a[] = {1, 2, 3,4};
	    
		System.out.println(getMaxfromArray(2, a));
	}
	
	public static int getMaxfromArray(int x, int[] a) {
		int result=x;
			for(int i=0;i<a.length;i++) {
				if(a[i]==x) {
					x=2*x;
					result=x;
					getMaxfromArray(x, a);
					}
			
		}
		return result;
	}
}

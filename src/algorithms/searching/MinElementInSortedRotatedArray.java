package algorithms.searching;

public class MinElementInSortedRotatedArray {

	public static void main(String[] args) {
		int arr1[] =  {5, 6, 1, 2, 3, 4}; 
		int arr6[] =  {5, 6, 7, 1, 2, 3, 4}; 
		System.out.println(minElementInArray(arr1, 0, arr1.length-1));
		System.out.println(minElementInArray(arr6, 0, arr6.length-1));
	}
	
	public static int minElementInArray(int[] arr,int s,int l) {
		int mid=(s+l)/2;
		if(arr[mid]<arr[mid-1] )
			return arr[mid];
		else if(arr[mid]<arr[l]) {
			s=mid+1;
			return minElementInArray(arr, s, l);
		}else {
			l=mid-1;
			return minElementInArray(arr, s, l);
		}
			
	}
}

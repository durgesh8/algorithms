package algorithms.searching;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr={1, 5, 7, 10, 12, 14, 15, 18, 20, 22, 25, 27, 30, 64, 110, 220};
		
		System.out.println(isPresent(0, arr.length-1, arr, 27));
	}
	
	public static boolean isPresent(int start,int  end, int[] arr,int key) {
		int mid=(end+start)/2; 
		while(start<=end) {
			if(arr[mid]==key) {
				return true;
			}
			else if(arr[mid]<key) {
		         start=mid+1;
			}else
				end=mid-1;
			mid=(end+start)/2; 
		}
	return  false;
	}
}

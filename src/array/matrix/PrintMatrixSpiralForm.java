package array.matrix;

public class PrintMatrixSpiralForm {

	
	static void spiralPrint(int m, int n,int a[][] ) {
		int i,k=0,l=0;
		
		while(k<m && l<n) {
			for( i=l;i<n;++i) {
				System.out.println(a[k][i]);
			}
			k++;
			
		}
	}
}

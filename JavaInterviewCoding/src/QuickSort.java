
public class QuickSort {

	public static void main(String[] args) {
		 int [] a= {12,8,9,15,11,7,10,20,4};
		int l= a.length;
		
	}
	public int partition(int[]a,int low,int high)
	{
		
		int pivot=a[(low+high)/2];
		while(low<=high)
		{
			while(a[low]<pivot)
			{
				low++;
			}
			while(a[high]>pivot)
			{
				high--;
			}
			if(low<=high)
			{
				int temp=a[low];
				a[low]=a[high];
				a[high]=pivot;
				
				low++;
				high--;
			}
		}
		return low;
	}

}

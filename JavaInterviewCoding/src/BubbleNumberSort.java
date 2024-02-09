
public class BubbleNumberSort {

	public static void main(String[] args) {
		int[]a= {36,19,29,12,5};
		int temp;
		
		for(int i=0;i<a.length;i++)  // this for loop is basically for no of rounds
		{
			
			for(int j=0;j<a.length-1-i;j++)  // this for loop is basically for comparing two successive elements
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		
		for(int i=0;i<a.length;i++)   // this for loop is for printing
		{
			System.out.print(a[i]+" ");
		}

	}

}

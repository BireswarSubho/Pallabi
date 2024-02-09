
public class BubbleStringSort {

	public static void main(String[] args) {
		String []a= {"v","h","z","e","b"};
		String temp;
		
		for(int i=0;i<a.length;i++)  // this for loop is basically for no of rounds
		{
			
			for(int j=0;j<a.length-1-i;j++)  // this for loop is basically for comparing two successive elements
			{
				if(a[j].compareTo(a[j+1])>0)
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}	
		}
		
		System.out.print("After Sorting : ");
		for(int i=0;i<a.length;i++)   // this for loop is for printing
		{
			System.out.print(a[i]+" ");
		}

	}

}

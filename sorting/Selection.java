package sorting;
import java.util.*;
public class Selection {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	methods m = new methods();
	System.out.println("enter the size of the array");
	int s = sc.nextInt();
	int [] a = new int[s];
	System.out.println("enter the element of array");
	for(int i = 0;i<s;i++)
		a[i]= sc.nextInt();
	System.out.println("enter the value 0 for ascending and 1 for descending order");
	int flag = sc.nextInt();
	m.selectionsort(a,s,flag);
	System.out.println("sorted array is :");
	for( int i=0;i<s;i++)
	System.out.println(a[i]);	

	}

}
class methods
{
	void selectionsort(int arr[],int size,int f) {
		if(f==0)
		{
		int minpos=0;
		for(int i=0;i<size;i++)
		{
			minpos = minimum(arr,i,size);
			swap(arr,i,minpos);
		}
	}
	if(f==1)
	{
		int maxpos=0;
		for(int i=0;i<size;i++) {
			maxpos = maximum(arr,i,size);
			swap(arr,i,maxpos);
		}
	}
	}
	int minimum(int arr[],int start,int stop)
	{
		int minpos = start;
		int mindata = arr[start];
		for( int i= start+1;i<stop;i++) {
			if(arr[i] < mindata)
			{
				mindata = arr[i];
				minpos = i;
			}
				
		}
		return minpos;
	}
	int maximum(int arr[],int start,int stop)
	{
		int maxpos = start;
		int maxdata = arr[start];
		for( int i= start+1;i<stop;i++) {
			if(arr[i] > maxdata)
			{
				maxdata = arr[i];
				maxpos = i;
			}
				
		}
		return maxpos;
	}
	void swap(int arr[],int i, int j)
	{
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}
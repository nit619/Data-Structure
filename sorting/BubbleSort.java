package sorting;
import java.util.*;
public class BubbleSort {
	static int count=0;
	static int count1=0;

	public static void main(String[] args) {
		System.out.println("enter the size of array");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
int[] arr = new int[n];
System.out.println("enter the elements");
for(int i=0;i<n;i++)
	arr[i]=sc.nextInt();
BB bs = new BB();
bs.bubblesort(arr,n);
System.out.println("sorted array is:");
for(int i=0;i<n;i++)
	System.out.println(arr[i]);
System.out.println("total comparison= "+ count);
System.out.println("total swap= "+ count1);
	}


}
class BB
{
	public void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public void compete(int arr[],int size) {
	
		for(int i=0;i<size-1;i++)
		{
			BubbleSort.count++;
			if(arr[i]>arr[i+1])
			{ 
			BubbleSort.count1++;
				swap(arr,i,i+1);
			}
		}
	}
	
	public void bubblesort(int arr[],int size)
	{
		for(int i=0;i<size;i++)
			compete(arr,size-i);
		
	}
}

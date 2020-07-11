package sorting;
import java.util.*;
public class Insertion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int s = sc.nextInt();
		int [] a = new int[s];
		System.out.println("enter the elements in an array");
		for( int i =0; i<s;i++)
			a[i]= sc.nextInt();
		System.out.println("enter 0 for ascending and 1 for descending");
		int flag = sc.nextInt();
		method m = new method();
		m.insertionsort(a,s,flag);
		System.out.println("sorted array is:");
		for(int i=0;i<s;i++)
			System.out.println(a[i]);
			
		

	}

}
class method
{
	void insertionsort( int arr[],int size, int f)
	
	{
		if (f==0)
		{
			for(int i=0;i<size;i++)
		 insert1(arr,i,arr[i]);
		}
		if (f==1)
		{
			for(int i=0;i<size;i++)
				insert2(arr,i,arr[i]);
		}
	}
	void insert1(int arr[],int size,int element)
	{
		int i=0;
		for( i=size-1;i>=0;i--)
		{
			if( element < arr[i])
				arr[i+1]= arr[i];
			else 
				break;
			
		}
		arr[i+1]= element;
	}
void insert2(int arr[],int size,int element)
{
	int i =0;
	for(i=size-1;i>=0;i--)
	{
		if( element > arr[i])
			arr[i+1]= arr[i];
		else 
			break;
		
	}
	arr[i+1]= element;
}
}
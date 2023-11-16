import java.util.Scanner;

public class Q3 {
	public  static int linearSearch(int arr[],int key) {
		int comparison=0;
		for(int num:arr) {
		     comparison++;
		     if(num==key) {
		    	 break;
		     }
		}
		return comparison;	
	}
	public static int binarySearch(int arr[],int key) {
		int comparison=0;
		int startIndex=0;
		int endIndex=arr.length-1;
		while(startIndex<=endIndex) {
			comparison++;
		
		
			int mid=(startIndex+endIndex)/2;
			if(arr[mid]>key) {
				
				endIndex=mid-1;
			}
			else if(arr[mid]<key) {
				startIndex=mid+1;
			}
			else {
				break;
				
			}
		}
		return comparison;
			
	}

	public static void main(String[] args) {
		int arr[]= {10,20,30,40,50,60};
		Scanner s=new Scanner(System.in);
		int key=s.nextInt();
		System.out.println("the total compariosn is ="+linearSearch(arr,key));
		System.out.println("the total compariosn is ="+binarySearch(arr,key));	

	}

}
//Write a program to print no of comparisions done to search a key in i. linear search ii. binary serach

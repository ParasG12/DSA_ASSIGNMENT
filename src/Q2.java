import java.util.Scanner;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Write a linear search algorithm to return index of last occurance of key.
		Scanner s=new Scanner(System.in);
		System.out.println("enter the key");
		int key=s.nextInt();
		int arr[]= {10,20,30,40,50,10};
		int index=-1;
		for(int i=arr.length-1;i>=0;i--) {
			if(arr[i]==key) {
				index=i;
				break;
			}
			
		}
		if(index!=-1) {
			System.out.println("the index of the element is"+index);
		}
		else {
			System.out.println("index not found");
		}
	}

}

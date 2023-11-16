import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		int arr[]= {50,40,30,20,10};
		Scanner s=new Scanner(System.in);
		System.out.println("enter the key");
		int key=s.nextInt();
		int start=0;
		int end=arr.length-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(arr[mid]>key) {
				start=mid+1;
			}
			else if(arr[mid]<key) {
				end=mid-1;
			}
			else {
				System.out.println("elem found");
				break;
			}
		// TODO Auto-generated method stub

	}

}
}
//Implement binary search algorithm if array is sorted in descending order.

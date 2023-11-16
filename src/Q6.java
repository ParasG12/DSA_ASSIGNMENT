import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		int arr[]= {10,10,10,10,10};
		Scanner s=new Scanner(System.in);
		System.out.println("enter key to be searched");
		int key=s.nextInt();
		System.out.println("enter the value of n");
		int n=s.nextInt();
		
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				count++;
				
			}
		}
		if(count==n) {
			System.out.println(key + "is  present "+count+"times" );
		}
		else {
			System.out.println("not present ");
		}
		
		
		// TODO Auto-generated method stub

	}

}


public class Q9 {
public static int selectionSort(int arr[]) {
	int comparison=0;
	for(int i=0;i<arr.length-1;i++) {
		for(int j=i+1;j<arr.length;j++) {
			comparison++;
			int temp;
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
						}	}
	}
	return comparison;
	}
	public static void main(String[] args) {
		int arr[]= {5,45,12,32,2,14,8};
	int result=selectionSort(arr);
	System.out.println("the no of comparison is "+result);
	for(int i:arr) {
		System.out.println(i);
	}
}

}

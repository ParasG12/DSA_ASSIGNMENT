import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		HashMap<Integer,Integer>map=new HashMap<>();
		Scanner s=new Scanner(System.in);
		int res=s.nextInt();
		int arr[]={ 10, 20, 15, 3, 4, 4, 1 } ;
		Arrays.sort(arr);
		for(int elem:arr) {
			if(map.containsKey(elem)) {
				map.put(elem, map.get(elem)+1);
			}
			else {
				map.put(elem,1);
			}
		}
		int sum=0;
		for(Map.Entry val:map.entrySet()) {
			if((int)val.getKey()<=res) {
				sum+=(int)val.getValue();
				
			}
			else {
				break;
			}
			}
		System.out.println("the rank of the element is "+sum);
		}

}
//to find rank of an element in a stream of integers. rank: rank of a given integer "x", in stream is "total
//no. of ele's less than or equal to x (including x).
//Input: { 10, 20, 15, 3, 4, 4, 1 } Ouput: Rank of 4 is: 4

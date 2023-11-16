import java.util.HashMap;

public class Q7 {

	public static void main(String[] args) {
//		find the first non-repeating element: Input: find the first non-repeating element: Input: { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 }
       int arr[]={ 1, 2,  -1, 2, 1, 0, 4, -1, 7, 8 };
       HashMap<Integer,Integer>map=new HashMap<>();
       for(int elem:arr) {
    	   if(map.containsKey(elem)) {
    		   map.put(elem, map.get(elem)+1);
    	   }
    	   else {
    		   map.put(elem, 1);
    	   }
       }
       for(int res:arr) {
    	   int val=map.get(res);
    	   if(val==1) {
    		   System.out.println("the elem present only once is "+res);
    		   break;
    	   }
       }
       
       
	}

}

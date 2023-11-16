
public class Q1 {
//public static boolean isPalindrome(String s) {
//	if(s.length()==0 ||s.length()==1) {
//		return true;
//	}
//	if(s.charAt(0)!=s.charAt(s.length()-1)) {
//		return false;
//		}
//	else {
//		return isPalindrome(s.substring(1,s.length()-1));
//	}
//}
	public static void main(String[] args) {
		String s1="naman";
//		StringBuilder s2=new StringBuilder(s1);
//		s2=s2.reverse();
//		String s3=s2.toString();
//		if(s3.equals(s1)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not a palindrome");
//		}
//		if(isPalindrome(s1)) {
//			System.out.println("palindrome");
//		}
//		else {
//			System.out.println("not palindorme");
//		}
		String s3="";
		for(int i=0;i<s1.length();i++) {
			s3=s1.charAt(i)+s3;
		}
		if(s3.equals(s1)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not palindomre");
		}

	}

}

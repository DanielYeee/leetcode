package leetcode;

/**
 * determine whether an integer is a palindrome
 * an integer is a palindrome when it reads the same backward as forward
 * @author DanielYeee
 * @version1.0
 */
public class IsPalindrome {

	public static void main(String[] args) {
		boolean flag = isPalindrome(121);
		System.out.println(flag); 
	}
	
	public static boolean isPalindrome(int x) {
		if(x == 0) 
			return true;
		
		if(x < 0) 
			return false;
		
		int rev = 0;
		int tmp = x;
		while(tmp != 0) {
			rev *= 10;			//this line must in front of the next line
			rev += tmp % 10;
			tmp /= 10;
		}
		return rev == x;
	}
	
}

package leetcode;

/**
 * @version 1.0
 * @author DanielYeee
 *
 */

public class TwoNums {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		String lcAndValue = leetcode2TwoNum(arr,6);
		System.out.println(lcAndValue);
		}
		 

	/**
	 * @author DanielYeee
	 * @param  int[] arr,int target
	 * @return int[]
	 * 
	 * comment:程序可进一步完善，一个数组中可能有不止一对和为目标值
	 * comment：the program can be improve because an arr may have two pair of num that their sum equals target 
	 */
	public static String leetcode2TwoNum(int[] arr,int target) {
			for(int i = 0; i < arr.length;i++) {
				for(int j = i + 1;j < arr.length;j++) {
					if(arr[j] == (target - arr[i])) {
						return new String("location:" + i + "  " + j + ";value:" + arr[i] + " " + arr[j] );
					}
				}
			}
			throw new IllegalArgumentException("No two sum solution");
	}
}
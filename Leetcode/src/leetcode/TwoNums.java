package leetcode;

import java.util.HashMap;
import java.util.Map;


/**
 * @version 1.0
 * @author DanielYeee
 *given an array of integer,return indices of the two numbers such that they add up to a specific target
 */

public class TwoNums {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		String lcAndValue = twoSum2(arr,5);
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
						return new String("location:" + i + "  " + j + "\nvalue:" + arr[i] + " " + arr[j] );
					}
				}
			}
			throw new IllegalArgumentException("No two sum solution");
	}
	
	
	/**
	 * @param nums
	 * @param target
	 * @return String
	 * 同时使用图和数组进行判断
	 */
	 public static String twoSum(int[] nums,int target) {
		 	Map<Integer, Integer> map = new HashMap<>();
		 	for(int i = 0;i < nums.length;i++) { 
		 		map.put(nums[i],i);
		 	}
		 	for(int i = 0;i < nums.length;i++) {
		 		int complement = target - nums[i];
		 		if(map.containsKey(complement) && (map.get(complement) != i)) {	//判断值差存在和值不重复
		 			return new String("location:" + i + "  " + map.get(complement) + "\nvalue:" + nums[i]  + " " + complement);
		 		}
		 	}
		 	throw new IllegalArgumentException("No two sum solution");
		 
	 }
	 
	 /**
	  * 
	  * @param nums
	  * @param target
	  * @return String
	  */
	 public static String twoSum2(int[] nums,int target) {
		 Map<Integer, Integer> map = new HashMap<>();
		 for(int i = 0;i < nums.length;i++) {
			 int complement = target - nums[i];
			 if(map.containsKey(complement)) {
				 return new String("locatin:" + map.get(complement) + " " + i + "\nvalue:" + complement + " " + nums[i]);
			 }
			 map.put(nums[i], i);
		 }
		 throw new IllegalArgumentException("No two sum solution");
	 }
	
	
}
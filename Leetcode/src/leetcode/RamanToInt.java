package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @author DanielYeee
 *
 *Roman numbers are represented by seven different symbols: I(1),V(5),X(10),L(50),C(100),D(500) and M(1000).
 *For example,two is written as II in Roman numeral, just two one's added together. 
 *Twelve is written as, XII , which is simply X + II . 
 *The number twenty seven is written as XXVII , which is XX + V + II .
 *Roman numerals are usually written largest to smallest from left to right. 
 *However, the numeral for four is not IIII . 
 *Instead, the number four is written as IV . Because the one is before the five we subtract it making four. 
 *The same principle applies to the number nine, which is written as IX . 
 *There are six instances where subtraction is used:
 *I can be placed before V (5) and X (10) to make 4 and 9.
 *X can be placed before L (50) and C (100) to make 40 and 90.
 *C can be placed before D (500) and M (1000) to make 400 and 900.
 *Given a roman numeral, convert it to an integer. 
 *Input is guaranteed to be within the range from 1 to 3999.
 *
 */
public class RamanToInt {

	public static void main(String[] args) {
		System.out.println(romanToInt("VIXL"));
	}

	/**
	 * 
	 */
	public static int romanToInt(String s) {
		Map<Character, Integer> map = new HashMap<>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);
		
		int result = 0;
		for(int i = 0;i < s.length();i++) {
			if(i > 0 && map.get(s.charAt(i)) > map.get(s.charAt(i - 1))) {
				result += map.get(s.charAt(i)) - 2 * map.get(s.charAt(i - 1));
			}else
				result += map.get(s.charAt(i));
		}
		return result;
	}

}

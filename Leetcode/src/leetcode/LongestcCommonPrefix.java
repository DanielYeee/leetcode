package leetcode;

/**
 * there are three methods to find the longest common prefix of a string array.
 * @author DanielYeee
 *write a function to find the longest common prefix string amongst an array of strings
 *if there is no common prefix ,return an empty string ""
 */
public class LongestcCommonPrefix {

	public static void main(String[] args) {
		String[] str = {"lower","loft","loop"};
		System.out.println(longestCommonPrefix3(str));
	}
	
	public static String longestCommonPrefix1(String[] str) {
		if(str.length == 0) //空数组
			return "";
		int i = 0;//共同前缀长度
		String prefix = "";
		String result;
		boolean broken = false;//跳出while循环标志
		while(true) {
			i++;//预先增大共同前缀长度
			result = prefix;
			if(i > str[0].length())  //前缀长度大于第一个字符串则退出循环
				break;
			prefix = str[0].substring(0, i);//以第一个字符串为基准，逐渐增大共同前缀的长度
			for(String word : str) {
				//跳出while循环条件：（1）预先设置的共同前缀长度大于字符串数组中其中一个字符串；
				//					（2）字符串数组中某个字符串不以prefix开头。
				if(i > word.length() || !word.startsWith(prefix)) {
					broken = true;
					break;
				}
			}
			if(broken)
				break;
		}
		return result;
	}
	
	public static String longestCommonPrefix2(String[] str) {
		if(str.length == 0)
			return "";
		String prefix = str[0];
		for(int i = 1;i < str.length;i++) {
			while(str[i].indexOf(prefix) != 0) {
				prefix = prefix.substring(0, prefix.length()-1);
				if(prefix.isEmpty())
					return "";
			}
		}
		return prefix;
	}
	
	public static String longestCommonPrefix3(String[] str) {
		if(str.length == 0)
			return "";
		for(int i = 0;i < str[0].length();i++) {
			char c = str[0].charAt(i);
			for(int j= 1;j < str.length;j++) {
				if(i == str[j].length() || str[j].charAt(i) != c)
					return str[0].substring(0, i);
			}
		}
		return str[0];
	}
	

}

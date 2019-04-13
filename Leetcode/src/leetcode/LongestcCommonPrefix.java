package leetcode;

/**
 * 
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
		if(str.length == 0) //������
			return "";
		int i = 0;//��ͬǰ׺����
		String prefix = "";
		String result;
		boolean broken = false;//����whileѭ����־
		while(true) {
			i++;//Ԥ������ͬǰ׺����
			result = prefix;
			if(i > str[0].length())  //ǰ׺���ȴ��ڵ�һ���ַ������˳�ѭ��
				break;
			prefix = str[0].substring(0, i);//�Ե�һ���ַ���Ϊ��׼��������ͬǰ׺�ĳ���
			for(String word : str) {
				//����whileѭ����������1��Ԥ�����õĹ�ͬǰ׺���ȴ����ַ�������������һ���ַ�����
				//					��2���ַ���������ĳ���ַ�������prefix��ͷ��
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

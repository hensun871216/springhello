package hensun.SpringHello;

import java.awt.RenderingHints.Key;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
	private static String staticStr="Yes";
	private  String noneStaticStr="no";
	public Test() {
	}

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		Map<String, String> hash = new LinkedHashMap<String, String>();
		hash.put("1", "11111");
		hash.put("2", "222222");
		hash.put("4", "33333333");
		hash.put("3", "33333333");
		
		for(String key : hash.keySet()) 
			System.out.println("key======" + key);
		System.out.println("endTime=========" +(System.currentTimeMillis() - start));
		
	}

	private void test() {
		System.out.println(getClass().getName());
		System.out.println(super.getClass().getName());
		System.out.println(getClass().getSuperclass().getName());
	}
	
	private static String reversal(String str) {
		if (str == null || str.length() < 1)
			return "";
		if (str.indexOf(" ") == -1)
			return str;
		int start = str.indexOf(" ");
		if (start == 0)
			start = 1;
		return reversal(str.substring(start)) + str.substring(0, start);
	}
	
	class inner {
		public void testInner() {
			System.out.println(staticStr);
			System.out.println(noneStaticStr);
		}
	}
	

}

package test;

public class StringTestingSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="This is a test. check it";
		String sub ="was";
		String search ="is";
		int k = s.indexOf("is");
		System.out.println(k);
		String result = s.substring(0, k);
		result = result + sub;
		result = result+s.substring(k+search.length());
		System.out.println(result);
		int i =10;

	}

}

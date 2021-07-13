package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class newtest {

	public static void main(String[] args) {
		
		//System.setProperty("name", "saffan");
		
		//System.out.println(System.getProperty("name"));
		char c='`';
		int ascii= (int)c;
		System.out.println(ascii);
		double t =1.09008988;
		short i = 54;
		System.out.println(t);
		
		List<Integer> arr= Arrays.asList(1,2,3,4,5,6);
		String result="NO";
		for(int a:arr) {
			if(a==10) {
				result="YES";
				break;
			}
			else
				continue;
		}
		System.out.println(result);
		
		byte a=120;
		byte b=120;
		byte d = (byte) (a*b);
		System.out.println(d);
		
		
		

		
	}
	
}
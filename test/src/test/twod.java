package test;

public class twod<T> {
	
	T ob;
	
	twod(T o){
		ob=o;
	}
	
	void showType(){		
		System.out.println("Value ="+ob.getClass().getName());	
	}
	
	T getob() {
		return ob;
	}
}

class demo{
	public static void main(String args[]) {
		twod<Integer> val = new twod<Integer>(11);
		int v =val.getob();
		System.out.println(v);
		val.showType();	
	}
}
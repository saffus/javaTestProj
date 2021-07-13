package test;

public class stringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String newFeature ;
		String s ="bhjjjj";
		char[] d = new char[] {'a','b'};
		//s.getChars(0, 3, d, 1);
		char[] d1 =s.toCharArray();
		System.out.println(d1);
		//System.out.println(d.getClass());
		String[] s1 = new String[] {"aaa","kkk"};
		
		
		byte[] b= s.getBytes();
		//System.out.println(b);
		/*
		 * for(byte bb:b) { System.out.println(bb); }
		 */
		
		String f =" i as sahsh     shjs ";
		System.out.println(f.split("\\s+").length);
		String[] k = f.split("\\s+");
		for(String h: k) {
			System.out.println(h);
		}
		
		char[] c =f.toCharArray();
		int y =c.length-1;
		
		boolean flag =false;
		int count = 0;
		for(int i=0;i<c.length;i++) {
			
			if(Character.isLetter(c[i]) && i!=y ) {
				flag =true;
			}else if(!Character.isLetter(c[i]) && flag) {
				count++;
				flag=false;
			}else if(Character.isLetter(c[i]) && i==y) {
				count++;
				}
			}
		
		
		System.out.println(count);
		}

	}



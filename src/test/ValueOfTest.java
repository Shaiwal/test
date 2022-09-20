package test;

public class ValueOfTest {
	
	public static void main(String args[]){
		Integer a1 = new Integer(50);
		Integer a2 = Integer.valueOf(50);
		Integer a3 = Integer.valueOf(50);
		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a1.equals(a3));
	}

}

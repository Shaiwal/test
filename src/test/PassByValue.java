package test;

public class PassByValue {
	
	public void showValue(int value) {
		System.out.println("2. Value is: "+ value);
		value = value + 5;
		System.out.println("3. Value is: "+ value);
	}
	
	public static void swap(Integer i, Integer j)  
	   { 
	      Integer temp = new Integer(i); 
	      i = j; 
	      j = temp; 
	      System.out.println(i + " ... " +j);
	   } 
	
	public static void main(String args[]) {
		PassByValue pv = new PassByValue();
		int val = 1;
		System.out.println("1. Value is: "+ val);
		pv.showValue(val);
		System.out.println("4. Value is: "+ val);
		
		Integer i = new Integer(10); 
	      Integer j = new Integer(20); 
	      swap(i, j); 
	      System.out.println("i = " + i + ", j = " + j); 
	}

}

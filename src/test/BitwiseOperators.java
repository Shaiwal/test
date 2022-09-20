package test;

import java.util.ArrayList;
import java.util.List;

public class BitwiseOperators {
	public static void main(String args[]) {
		int a = 5; 
        int b =  7; 
        String s = "Strawberries";
        s= s.substring(2, 5);
        System.out.println(s);
        List l = new ArrayList();
        l.add("hello");
        l.add(2);
        System.out.println(l.get(1) instanceof Object);
        // bitwise and 
        // 0101 & 0111=0101 
        System.out.println("a&b = " + (a & b)); 
  
        // bitwise and 
        // 0101 | 0111=0111 
        System.out.println("a|b = " + (a | b)); 
  
        // bitwise xor 
        // 0101 ^ 0111=0010 
        System.out.println("a^b = " + (a ^ b)); 
  
        // bitwise and 
        // ~0101=1010 
        System.out.println("~a = " + ~a); 
  
        // can also be combined with 
        // assignment operator to provide shorthand 
        // assignment 
        // a=a&b 
        a &= b; 
        System.out.println("a= " + a); 
        
        /// Shift operators
        int a1 = 0x0005; 
        int b1 = -10; 
  
        // left shift operator 
        // 0000 0101<<2 =0001 0100(20) 
        // similar to 5*(2^2) 
        System.out.println("a1<<2 = " + (a1 << 2)); 
  
        // right shift operator 
        // 0000 0101 >> 2 =0000 0001(1) 
        // similar to 5/(2^2) 
        System.out.println("a1>>2 = " + (a1 >> 2)); 
  
        // unsigned right shift operator 
        System.out.println("b1>>>2 = " + (b1 >>> 2)); 
        
         a = 20;b = 10; int c = 0; 
        
        // a=b+++c is compiled as 
        // b++ +c 
        // a=b+c then b=b+1 
        a = b++ + c; 
        /*
         * this statement has a similar effect of first assigning b+c to a and then incrementing b
         */
        System.out.println("Value of a(b+c), "
                           + " b(b+1), c = "
                           + a + ", " + b 
                           + ", " + c); 
        
        
	}
}

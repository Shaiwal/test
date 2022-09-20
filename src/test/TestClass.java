package test;

import java.util.ArrayList;
import java.util.List;


interface Interface {
	
}

public class TestClass implements Interface{
	static int a1;
	
	TestClass(){System.out.println();}
	
	TestClass(int a){
		//test(); will give error
	}
	void test1() {
		int x;
		if(true) {
			System.out.println(a1);
		}
	}
	public static void main(String args[]) {
	/*	String a = "shiv";
		String b = "xyz";
		int c = a.charAt(0);
		Integer i = (int)Integer.valueOf(1);
		String s = "abc";//Object s = "abc"
		String s1 = new String("xyz");
		String s2 = null;
		Interface intrfc = new test();
		if(i instanceof Integer) {
			System.out.println("true..");
		}
		if("abc".equals(new String("abc"))) {
			System.out.println("String equals true..");
		}
		if("abc" == new String("abc")) {
			System.out.println("String == true..");
		}
		if("abc" instanceof String) {
			System.out.println("s true..");
		}
		if(s2 instanceof String) {
			System.out.println("s2 true..");
		}
		if(intrfc instanceof Interface) {
			System.out.println("Interface true..");
		}
		System.out.println(c);
		a1 = 12;
		test t = new test();
		t.test1();
		*/
		
				
		String replicaSet =	"mgdb-cdcdev-npd1-1:27060;mgdb-cdcdev-npd2-1:27060;mgdb-cdcdev-npd3-1:27060";//replicaSet.split(";");
		String[] replicaHostArr =  replicaSet.split(";");
		List list = new ArrayList();
		for(String host:replicaHostArr) {
		System.out.println(host);
		String[] serverPortArr = host.split(":");
			list.add(serverPortArr[0] + Integer.valueOf(serverPortArr[1]));
		}
		System.out.println(list.get(0));
		//MongoClient mongoClient = new MongoClient(list, Arrays.asList(credential));
		/*
		 * String replicaSet =
		 * "mgdb-cdcdev-npd1-1*27060;mgdb-cdcdev-npd2-1*27060;mgdb-cdcdev-npd3-1*27060";
		 * String[] replicaHostArr = replicaSet.split(";"); List<> list = new
		 * ArrayList<>(); for(String host:replicaHostArr) { System.out.println(host);
		 * String[] serverPortArr = host.split(","); //list.add(new
		 * ServerAddress(serverPortArr[0], Integer.valueOf(serverPortArr[1]))); }
		 */
	}
}

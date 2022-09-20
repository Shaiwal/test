package test;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LRUCache {

	LinkedHashMap<Integer, Integer> linkedHashMap = null;
	Map<Integer, Date> leastRecentlyUsedMap = new HashMap<Integer,Date>();//needs map sorting
	List<Integer> leastRecentlyUsedSet = new ArrayList<Integer>();
	int leastRecentlyUsedKey = 0;
	private int capacity = 0;
	LRUCache(int cap) throws Exception{
		
		if(cap>=1) {
			linkedHashMap = new LinkedHashMap<Integer, Integer>(cap);
			capacity = cap;
		}else {
			throw new Exception("Capcity should be greater than 0.");
		}
	}
	
	public int get(int key)
    {
   // your code here
		if(this.linkedHashMap.get(key)>-1) {
			//this.leastRecentlyUsedMap.put(key, new Date());
			this.leastRecentlyUsedSet.remove(Integer.valueOf(key));
			this.leastRecentlyUsedSet.add(key);
			return this.linkedHashMap.get(key);
			
		}
			
		return -1;
   }
   
   // This method should work in O(1)
   public void set(int key, int value)
   
   {
       // your code here
	   if(this.linkedHashMap.size()==this.capacity) {
		   this.linkedHashMap.remove(this.leastRecentlyUsedSet.get(0));
		   this.linkedHashMap.put(key, value);
		   if(this.leastRecentlyUsedSet.contains(key))
			   this.leastRecentlyUsedSet.remove(key);
		   this.leastRecentlyUsedSet.add(key);
	   }else if(this.linkedHashMap.size()<this.capacity) {
		   this.linkedHashMap.put(key, value);
		   if(this.leastRecentlyUsedSet.contains(key))
			   this.leastRecentlyUsedSet.remove(key);
		   this.leastRecentlyUsedSet.add(key);
	   }
	   System.out.println(this.leastRecentlyUsedSet);
	   System.out.println(this.linkedHashMap);
   }
   
   public static void main(String args[]) {
	   try {
		LRUCache lruc = new LRUCache(5);
		lruc.set(1, 1);
		lruc.set(2, 2);
		lruc.set(3, 3);
		lruc.set(4, 4);
		lruc.set(5, 5);
		lruc.set(6, 6);
		System.out.println(lruc.get(4));
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
   }

}

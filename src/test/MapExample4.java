package test;

import java.util.*;  
class MapExample4{  
 public static void main(String args[]){  
Map<Integer,String> map=new HashMap<Integer,String>();          
      map.put(105,"Amit");    
      map.put(109,"Vijay");    
      map.put(102,"Rahul");    
      //Returns a Set view of the mappings contained in this map    
      map.entrySet()  
      //Returns a sequential Stream with this collection as its source  
      .stream()  
      //Sorted according to the provided Comparator  
      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))  
      //Performs an action for each element of this stream  
      .forEach(System.out::println);  
 }  
}  

package week1.day1.assignments;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

/*	public static void main(String[] args) {
	// TODO Auto-generated method stub
  String str = "java";
  Map<Character,Integer> CharMapCount = new HashMap<>();
  for (Character c : str.toCharArray()){
	  if (CharMapCount.containsKey(c)) {
		  CharMapCount.put(c, CharMapCount.get(c) + 1);
		  }
	  else {CharMapCount.put(c, 1);
	  
	  }
  }
	System.out.println(CharMapCount);
  }}*/
	
	public static void main(String[] args) {
String str = "java";
char[] c = str.toCharArray();
Map<Character,Integer> map = new HashMap<>();
for(int i=0;i<c.length;i++){
	  if (map.containsKey(c[i])) {
		  map.put(c[i], map.get((c)[i]) + 1);
		  }
	  else {map.put(c[i], 1);
	  
	  }
}
	System.out.println(map);
}}
	/*public static void main(String[] args) {
		String input="java";
		
		char toFind = 'j';
		
	    int occ=0;
		
		for(int i=0;i<input.length();i++) {
			
		 if (input.charAt(i)==toFind)	{
			 occ=occ+1;
	
		}
		}
	
	System.out.println("character is found" +occ + "number of times");
      	System.out.println("updating my test");
      	
	}}*/

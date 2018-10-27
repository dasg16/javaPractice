package practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class PerformActionMap{
	
	Map<String,String> map = new HashMap<>(); 
	
	
	public void addElement() {
		map.put("String 1", "Gourav");
		map.put("String 2", "Liz");
		map.put("String 3", "Nishanth");
		map.put("String 4", "Vamshi");
		
		System.out.println(map);
		System.out.println(map.get("String 2"));
		
	}
	
	
	public void getElement() {
	
		Set<String> se = map.keySet();
		Iterator it = se.iterator();
		
		while(it.hasNext()) {
			
			Object currentString= it.next();
			
			System.out.println(currentString + " " + map.get(currentString));			
		}
		
		
		
		
	}
	
}

public class MapPractice {
	
	
	public static void main(String[] args) {
		
		PerformActionMap pam = new PerformActionMap();
		pam.addElement();
		pam.getElement();
		
		
	}

}

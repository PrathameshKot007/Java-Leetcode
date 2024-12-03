package RomanToInt;

import java.util.HashMap;

public class RomanToInt {
    public int romanToInt(String s) {
         HashMap<Character, Integer> map = new HashMap<>();
	        map.put('I',1);
	        map.put('V',5);
	        map.put('X',10);
	        map.put('L',50);
	        map.put('C',100);
	        map.put('D',500);
	        map.put('M',1000);
	        int size = s.length();
	        int total=0;
	        
	        for(int i=0;i<size;i++){
	            int current = map.get(s.charAt(i)); //1
	            int next = (i+1<size)?map.get(s.charAt(i+1)) : 0; //1
	            
	            if(current<next) {
	            	total -=current;
	            }else {
	            	total+=current;
	            }
	            
	        }
	        return total;

    }
}

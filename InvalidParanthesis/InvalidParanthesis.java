package InvalidParanthesis;

import java.util.*;

public class InvalidParanthesis {

	public static void main(String[] args) {
		InvalidParanthesis iP = new InvalidParanthesis();
		System.out.println("The result is " + iP.isValid("([}}])"));
	}

	public boolean isValid(String s) {
		Stack<Character> stk = new Stack<>();
		
		if (s.length() % 2 != 0) {
	        return false;
	    }
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '{' || s.charAt(i) == '(' || s.charAt(i) == '[') {
				stk.push(s.charAt(i)); 
			} else if (s.charAt(i) == '}' || s.charAt(i) == ')' || s.charAt(i) == ']') {
				if(stk.isEmpty()) {
					return false;
				}
				char top = stk.peek();
				if(s.charAt(i) == '}' && top=='{'||
					s.charAt(i) == ')' && top=='(' ||
					s.charAt(i) == ']' && top=='[') {
					stk.pop();
				}else {
					return false;
				}
			}
		}
		return stk.isEmpty();
	}
}

package immocAlgorithme_Array;

import java.util.Stack;

public class Parentheses {
	/**
	 * Function check the given string is valide or not
	 * 
	 * @param candidate
	 * @return
	 */
	public boolean valideOrNot(String candidate) {
		char[] chars = candidate.toCharArray();
		Stack<Character> stack = new Stack<Character>();
		int i = 0;
		while (i < chars.length) {
			char temp = chars[i++];
			if (temp == '[' || temp == '{' || temp == '(')
				stack.push(temp);
			else if (stack.isEmpty())
				return false;
			else if (temp == ')' && stack.lastElement() == '(')
				stack.pop();
			else if (temp == ']' && stack.lastElement() == '[')
				stack.pop();
			else if (temp == '}' && stack.lastElement() == '{')
				stack.pop();
			else
				return false;
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}

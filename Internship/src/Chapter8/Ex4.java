package Chapter8;

import java.util.Stack;

public class Ex4 {

	public static void main(String[] args) {
		
		int n = 251;
		
		Stack<String> binNum = new Stack<>();

        while (n > 0)
        {
            if (n % 2 == 1) {
            	binNum.push("1");
            } else {
            	binNum.push("0");
            }
            n /= 2;
        }
        
        while (binNum.isEmpty() == false) {
        	System.out.print(binNum.pop());
        }
	}

}

package Legacy_Classes;

import java.util.Stack;

public class Stack1 {

	public static void main(String[] args) {


		//push the element in stack
		//pop the element from stack
		//peek the element from the top
		//search the element in stack it gets a index value
		//empty check the stack is empty or not empty //it returns boolean value
		Stack s=new Stack();
		s.push(100);
		s.push("sachin");
		s.push(300);
		s.push("gopal");
		s.push(500);
		
		System.out.println(s);
		
		System.out.println(s.pop());
		System.out.println(s);
		
		System.out.println(s.peek());
		System.out.println(s);
		
		System.out.println(s.search(100));
		System.out.println(s.search(600));
		
		System.out.println(s.empty());

	}

}

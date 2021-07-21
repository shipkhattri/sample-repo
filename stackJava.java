package stackJava;
import java.util.*;

public class stackJava {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(3);
		s.push(10);
		s.push(7);
		s.push(15);
		s.push(30);
		System.out.println("Stack: "+s);
		s.pop();
		System.out.println("After popped Stack: "+s);
		System.out.println("Top element of Stack: "+s.peek());
		System.out.println("Size of Stack: "+s.size());
		if(s.search(15)!=-1)
			System.out.println("Found at "+s.search(15));
		else
			System.out.println("Not Found");
		s.clear();
		if(s.empty())
			System.out.println("Empty stack");
	}

}

package Week9;

import java.util.function.Consumer;

public class DequeClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<Integer> intDeq = new Deque<Integer>();
		intDeq.addFirst(10);
		intDeq.addFirst(12);
		intDeq.addLast(15);
		intDeq.addFirst(25);
		
		// Consumer object!
		Consumer<Integer> action = System.out::println;
		intDeq.forEach(action);
		
		intDeq.addFirst(100);
		intDeq.removeLast();
		intDeq.removeLast();
		intDeq.addLast(23);
		intDeq.addFirst(26);
		intDeq.removeFirst();
		intDeq.forEach(action);
	}

}

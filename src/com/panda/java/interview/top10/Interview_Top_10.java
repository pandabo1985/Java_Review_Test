package com.panda.java.interview.top10;

/**
 * 
 * @author panda
 * 
 */
public class Interview_Top_10 {
	public static void main(String[] args) {
		top_01_strig();
		top_02_LinkedList();
		top_03_stack();
		top_03_queue();
	}

	private static void top_03_queue() {
		System.out.println("==queue==");
		Queue queue = new Queue();
		Node node_01 = new Node(1);
		Node node_02 = new Node(2);
		Node node_03 = new Node(3);
		System.out.println("==" + queue.dequeue());
		queue.enqueue(node_01);
		queue.enqueue(node_02);
		queue.enqueue(node_03);
		System.out.println("==" + queue.dequeue().val);
		System.out.println("==" + queue.dequeue().val);
		System.out.println("==" + queue.dequeue().val);
		
	}

	private static void top_03_stack() {
		System.out.println("==stack==");
		Stack stack = new Stack();
		Node node_01 = new Node(1);
		Node node_02 = new Node(2);
		Node node_03 = new Node(3);
		System.out.println("==" + stack.peek());
		stack.push(node_01);
		stack.push(node_02);
		stack.push(node_03);
		System.out.println("==" + stack.pop().val);
		System.out.println("==" + stack.pop().val);
		System.out.println("==" + stack.pop().val);
	}

	private static void top_02_LinkedList() {
		System.out.println("=参考：=" + Node.class.getSimpleName());
	}

	private static void top_01_strig() {
		// toCharArray() //get char array of a String
		// Arrays.sort() //sort an array
		// Arrays.toString(char[] a) //convert to string
		// charAt(int x) //get a char at the specific index
		// length() //string length
		// length //array size
		String toChar = "panda";
		char[] strChar = toChar.toCharArray();
		System.out.println("第0个字母是：" + strChar[0]);
	}

}

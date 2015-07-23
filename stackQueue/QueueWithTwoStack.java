package stackQueue;

public class QueueWithTwoStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueImplementTwoStack queue = new QueueImplementTwoStack();
		queue.push(1);
		queue.push(2);
		queue.push(3);
		System.out.println(queue.pop());
		System.out.println(queue.pop());

	}

}

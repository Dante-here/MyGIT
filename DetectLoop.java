public class DetectLoop{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
	}
	public static boolean checkCycle(Node head){
		if(head == null || head.next == null){	//coz checking if atleast 2 nodes
			return false;
		}
		Node slow = head;
		Node fast = head.next;
		while(slow != fast){
			if(fast == null || fast.next ==null){
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
	}
	
	
	public static void main(String[] args){
		DetectLoop list1 = new DetectLoop();
		list1.head = new Node(1);
		list1.head.next = new Node(2);
		list1.head.next.next = new Node(3);
		list1.head.next.next.next = new Node(10);
		list1.head.next.next.next.next = list1.head.next;
		
		System.out.println("Result: "+checkCycle(list1.head));
		System.out.println();
		System.out.println("(True = Cycle detected / False = Not Circular)");
	}
}
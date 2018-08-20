/**
 * 
 */
package immocAlgorithme_List;

/**
 * @author Chenggang
 *
 */
public class LinkedList<E> {

	private class Node {
		public E e;
		public Node next;

		public Node(E e, Node next) {
			this.e = e;
			this.next = next;
		}

		public Node(E e) {
			this(e, null);
		}

		public Node() {
			this(null, null);
		}
	}

	// private Node head;
	private int size;
	private Node dummyHead;

	public LinkedList() {
		// head = null;
		dummyHead = new Node(null, null);
		size = 0;
	}

	public int getSize() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public void addFirst(E e) {
		// Node newNode = new Node(e);
		// newNode.next = head;
		// head = newNode;
		// dummyHead = new Node(e, );
		// size++;
		add(0, e);
	}

	/**
	 * add a element at specific index(0-based)
	 * 
	 * @param e
	 */
	// public void add(int index,E e){
	// if(index<0||index>size)
	// throw new IllegalArgumentException("Add failed. Illegal index");
	// if(index == 0)
	// addFirst(e);
	// else{
	// Node prev = head;
	// for(int i = 0;i<index-1;i++)
	// prev = prev.next;
	// prev.next = new Node(e,prev.next);
	// size++;
	// }
	// }
	public void add(int index, E e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Illegal index");
		Node prev = dummyHead;
		for (int i = 0; i < index; i++)
			prev = prev.next;
		prev.next = new Node(e, prev.next);// 连接链表元素的核心代码
		size++;

	}

	public void addLast(E e) {
		add(size, e);
	}

	public E get(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Illegal index");
		Node cur = dummyHead.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		return cur.e;
	}

	public E getFirst() {
		return get(0);
	}

	public E getLast() {
		return get(size - 1);
	}

	public void set(int index, E e) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Illegal index");
		Node cur = dummyHead.next;
		for (int i = 0; i < index; i++) {
			cur = cur.next;
		}
		cur.e = e;
	}

	public boolean contains(E e) {
		Node cur = dummyHead.next;
		while (cur != null) {
			if (cur.e.equals(e))
				return true;
			cur = cur.next;
		}
		return false;
	}

	public E remove(int index) {
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Illegal index");
		Node prev = dummyHead;
		for (int i = 0; i < index; i++) {
			prev = prev.next;
		}
		Node retNode = prev.next;
		prev.next = retNode.next;
		retNode.next = null;
		size--;
		return retNode.e;
	}

	public E removeFirst() {
		return remove(0);
	}

	public E removeLast() {
		return remove(size - 1);
	}

	public String toString() {
		StringBuilder res = new StringBuilder();

		Node cur = dummyHead.next;
		while (cur.next != null) {
			res.append(cur.e + "->");
			cur = cur.next;
		}
		res.append(cur.e);
		return res.toString();
	}

}

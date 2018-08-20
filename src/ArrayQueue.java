package immocAlgorithme_Array;

public class ArrayQueue<E> implements Queue<E> {
	private Array<E> array;
	/**
	 * constructor
	 * @param capacity
	 */
	public ArrayQueue(int capacity){
		array = new Array<E>(capacity);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		return array.removeFirst();
	}

	@Override
	public E getFront() {
		// TODO Auto-generated method stub
		return array.get(0);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return array.getSize();
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return array.isEmpty();
	}
	
	/**
	 * print data with format
	 */
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append("Queue: ");
		res.append("front [");
		for (int i = 0; i < array.getSize(); i++) {
			if (i == array.getSize() - 1)
				res.append(array.get(i));
			else
				res.append(array.get(i) + ",");
		}
		res.append("] tail");
		return res.toString();
	}

}

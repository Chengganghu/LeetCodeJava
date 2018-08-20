package immocAlgorithme_Array;

public class LoopQueue<E> implements Queue<E> {
	private E[] data;
	private int tail, front;
	private int size;

	/**
	 * constructor with para capacity
	 * 
	 * @param capacity
	 */
	public LoopQueue(int capacity) {
		data = (E[]) new Object[capacity + 1];
		front = 0;
		tail = 0;
		size = 0;
	}

	/**
	 * Constructor without para
	 */
	public LoopQueue() {
		this(10);
	}

	@Override
	public void enqueue(E e) {
		// TODO Auto-generated method stub
		if ((tail + 1) % data.length == front) {
			resize(getCapacity() * 2);
		}
		data[tail] = e;
		tail = (tail + 1) % data.length;
		size++;
	}

	private void resize(int newCapacity) {
		// TODO Auto-generated method stub
		E[] newData = (E[]) new Object[newCapacity + 1];
		for (int i = 0; i < size; i++) {
			newData[i] = data[(i + front) % data.length];
		}
		data = newData;
		front = 0;
		tail = size;
	}

	public int getCapacity() {
		// TODO Auto-generated method stub
		return data.length - 1;
	}

	@Override
	public E dequeue() {
		// TODO Auto-generated method stub
		if (front == tail)
			throw new IllegalArgumentException("dequeue failed. Cannot dequeue from an empty queue");
		E ret = getFront();
		data[front] = null;
		front = (front + 1) % data.length;
		size--;
		if (size == getCapacity() / 2 && getCapacity() / 2 != 0) {
			resize(getCapacity() / 2);
		}
		return ret;
	}

	@Override
	public E getFront()  {
		// TODO Auto-generated method stub
		if(isEmpty()){
			throw new IllegalArgumentException("Queue is empty");
		}
		return data[front];
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return tail == front;
	}
	
	public String toString(){
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array: size = %d , capacity = %d\n", size, getCapacity()));
		res.append("front [");
		for (int i = front; i < front + size; i++) {
			if (i == front+size-1)
				res.append(data[i%data.length]);
			else
				res.append(data[i%data.length] + ",");
		}
		res.append("] tail");
		return res.toString();
	}

}

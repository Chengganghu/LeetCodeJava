package immocAlgorithme_Array;

public class Array<E> {
	private E[] data;
	private int size;

	/**
	 * Constructor with a para capacity
	 * 
	 * @param capacity
	 */
	public Array(int capacity) {
		data = (E[]) new Object[capacity];
	}
	/**
	 * get size of array
	 * @return
	 */
	public int getSize() {
		return size;
	}

	/**
	 * Constructor with no para, set a capacity by default
	 */
	public Array() {
		this(10);
	}

	/**
	 * return the capacity of array
	 * 
	 * @return
	 */
	public int getCapacity() {
		return data.length;
	}

	/**
	 * Check if array is empty
	 * 
	 * @return
	 */
	public boolean isEmpty() {
		return size == 0;
	}

	/**
	 * add a element at specific index
	 * 
	 * @param index
	 * @param e
	 */
	public void add(int index, E e) {
		if (size == data.length)
			// throw new IllegalArgumentException("Add failed. Array is full.");
			resize(2 * data.length);
		if (index < 0 || index > size)
			throw new IllegalArgumentException("Add failed. Require index >=0 and <=size");
		for (int i = size - 1; i >= index; i--)
			data[i + 1] = data[i];

		data[index] = e;
		size++;
	}

	/**
	 * add a element at the tail of array
	 * 
	 * @param e
	 */
	public void addLast(E e) {
		add(size, e);
	}

	/**
	 * add a element at the head of array
	 * 
	 * @param e
	 */
	public void addFirst(E e) {
		add(0, e);
	}

	/**
	 * set a new value at specific index
	 * 
	 * @param index
	 * @param e
	 */
	public void set(int index, E e) throws IllegalArgumentException {
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("Get failed. Index is illegal");
		data[index] = e;
	}

	/**
	 * Get the element at specific index
	 * 
	 * @param index
	 * @return
	 */
	public E get(int index) {
		if (index < 0 || index >= size) {
			throw new IllegalArgumentException("Get failed. Index is illegal");
		}
		return data[index];
	}
	
	public E getFirst(){
		return get(0);
	}
	
	public E getLast(){
		return get(size-1);
	}
	/**
	 * Check if array contains e
	 * 
	 * @param e
	 * @return
	 */
	public boolean contains(E e) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(e))
				return true;
		}
		return false;
	}

	/**
	 * Try to find e in array, if found, return the index. if not , return -1
	 * 
	 * @param e
	 * @return
	 */
	public int find(E e) {
		for (int i = 0; i < size; i++) {
			if (data[i].equals(e))
				return i;
		}
		return -1;
	}

	/**
	 * Remove element at specific index
	 * 
	 * @param index
	 * @return
	 */
	public E remove(int index) {
		if (index < 0 || index >= size)
			throw new IllegalArgumentException("remove failed. illegal index");
		E found = data[index];
		for (int i = index; i < size - 1; i++) {
			data[i] = data[i + 1];
		}
		//data[size--] = null;
		size--;
		if (size == data.length / 2)
			resize(data.length / 2);
		return found;
	}

	/**
	 * Remove the first element in array
	 * 
	 * @return
	 */
	public E removeFirst() {
		return remove(0);
	}

	/**
	 * remove the last element in array
	 * 
	 * @return
	 */
	public E removeLast() {
		return remove(size-1);
	}

	/**
	 * print data with format
	 */
	public String toString() {
		StringBuilder res = new StringBuilder();
		res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
		res.append('[');
		for (int i = 0; i < size; i++) {
			if (i == size - 1)
				res.append(data[i]);
			else
				res.append(data[i] + ",");
		}
		res.append(']');
		return res.toString();
	}
	/**
	 * Dynamic array, redefine the size of array
	 * @param newCapacity
	 */
	private void resize(int newCapacity) {
		E[] newData = (E[]) new Object[newCapacity];
		for (int i = 0; i < size; i++) {
			newData[i] = data[i];
		}
		data = newData;
	}
}

package immocAlgorithme_Array;

public interface Queue<E> {
	/**
	 * 
	 * @param e
	 */
	void enqueue(E e);
	/**
	 * 
	 * @return
	 */
	E dequeue();
	/**
	 * 
	 * @return
	 */
	E getFront();
	/**
	 * 
	 * @return
	 */
	int getSize();
	/**
	 * 
	 * @return
	 */
	boolean isEmpty();
}

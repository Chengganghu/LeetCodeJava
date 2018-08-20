package immocAlgorithme_Stack;

import immocAlgorithme_Array.Array;;

public class ArrayStack<E> implements Stack<E> {
	Array<E> array;
	
	public ArrayStack(int capacity){
		array = new Array<E>(capacity);
	}
	
	public ArrayStack(){
		this(10);
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

	@Override
	public void push(E e) {
		// TODO Auto-generated method stub
		array.addLast(e);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return array.removeLast();
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return array.get(array.getSize()-1);
	}

}

/**
 * 
 */
package immocAlgorithme_Array;

import java.util.Random;

/**
 * @author Chenggang
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int opCount = 10;
		ArrayQueue<Integer> aq = new ArrayQueue<Integer>(5);
		LoopQueue<Integer> lq = new LoopQueue<Integer>(5);
		double time1 = testQueue(aq,opCount);
		double time2 = testQueue(lq,opCount);
		System.out.println("ArrayQueue, time: "+time1);
		System.out.println("LoopQueue, time: "+time2);
		
		Array<Integer> array = new Array<Integer>();
		for(int i=0;i<10;i++){
			array.addFirst(i);
			System.out.println(array);
		}
		for(int i=0;i<10;i++){
			array.removeLast();
			System.out.println(array);
		}
	}
	
	public static double testQueue(Queue<Integer> q,int opCount){
		long startTime = System.currentTimeMillis();
		Random random = new Random();
		for(int i=0;i<opCount;i++)
			q.enqueue(random.nextInt(100));
		for(int i=0;i<opCount;i++){
			q.dequeue();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

}

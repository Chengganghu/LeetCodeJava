/**
 * 
 */
package immocAlgorithme_List;

/**
 * @author Chenggang
 *
 */
public class Lanceur {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll = new LinkedList<String>();
		ll.addFirst("a");
		ll.addFirst("b");
		ll.addFirst("c");
		ll.remove(1);
		System.out.println(ll);
	}

}
